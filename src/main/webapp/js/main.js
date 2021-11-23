/**
 * Weight List
 */
const ajax = new XMLHttpRequest();
const contextPath = window.location.pathname.substring(0, window.location.pathname.indexOf("/",2));

const trackingTab = document.querySelector('#trackingTab')
trackingTab.addEventListener('click', function () {
  ajax.open("GET", contextPath + '/weight', true);
  ajax.send();
  ajax.onreadystatechange = function () {
    if (ajax.readyState == 4 && ajax.status == 200) {
      const weightList = JSON.parse(ajax.responseText);
      console.log(weightList)
    }
  }
})

/**
 * New Register Modal
 */
const activityFormTrack = document.querySelector('#activityFormTrack')
const foodFormTrack = document.querySelector('#foodFormTrack')
const pressureFormTrack = document.querySelector('#pressureFormTrack')
const weightFormTrack = document.querySelector('#weightFormTrack')

const newTrackCarouselNextBtn = document.querySelector('#newTrackCarouselNextBtn')
newTrackCarouselNextBtn.disabled = true

const trackListOptions = document.getElementsByName('listOption')

for (const trackListOption of trackListOptions) {
  trackListOption.addEventListener('change', function () {
    activityFormTrack.style.display = 'none'
    foodFormTrack.style.display = 'none'
    pressureFormTrack.style.display = 'none'
    weightFormTrack.style.display = 'none'
    if (trackListOption.checked) {
      newTrackCarouselNextBtn.disabled = false;
      switch (trackListOption.id) {
        case 'weightOption':
          weightFormTrack.style.display = 'block'
          break
        case 'foodOption':
          foodFormTrack.style.display = 'block'
          break
        case 'pressureOption':
          pressureFormTrack.style.display = 'block'
          break
        case 'activityOption':
          activityFormTrack.style.display = 'block'
          break
      }
    }
  })
}

const newTrackModal = document.querySelector('#newTrackModal')
newTrackModal.addEventListener('hidden.bs.modal', function (event) {
  const trackTypeForm = document.querySelector('#trackTypeForm')
  trackTypeForm.reset()
  const carouselNewTrack = document.querySelector('#carouselNewTrack')
  const carousel = new bootstrap.Carousel(carouselNewTrack);
  carousel.to(0)
  newTrackCarouselNextBtn.disabled = true
})

/**
 * Toast Message
 * */
const trackAddBtn = document.querySelector('#trackAddBtn')
const toastMessage = document.querySelector('#successToast')
toastMessage.style.display = 'none'
trackAddBtn.addEventListener('click', function () {
  const toast = new bootstrap.Toast(toastMessage)
  toast.show()
})
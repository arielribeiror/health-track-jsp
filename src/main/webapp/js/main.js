/**
 * New Register Modal
 */
const newTrackCarouselNextBtn = document.querySelector('#newTrackCarouselNextBtn')
newTrackCarouselNextBtn.disabled = true

const trackListOptions = document.getElementsByName('listOption')

for (const trackListOption of trackListOptions) {
  trackListOption.addEventListener('change', function () {
    if (trackListOption.checked) {
      newTrackCarouselNextBtn.disabled = false
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
trackAddBtn.addEventListener('click', function () {
  const toast = new bootstrap.Toast(toastMessage)
  toast.show()
})
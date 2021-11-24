const ajax = new XMLHttpRequest();
const contextPath = window.location.pathname.substring(0, window.location.pathname.indexOf("/", 2));

/**
 * Dashboard
 */


/**
 * Weight List
 */
let weightList
const trackingTab = document.querySelector('#trackingTab')
trackingTab.addEventListener('click', function () {
  if (!weightList) {
    ajax.open("GET", contextPath + '/weight', true);
    ajax.send();
    ajax.onreadystatechange = function () {
      if (ajax.readyState == 4 && ajax.status == 200) {
        weightList = JSON.parse(ajax.responseText);
        const weightListEl = document.querySelector('#weightList')
        let previousValue = null
        weightList.reverse()
        weightList.forEach((weightItem, i) => {
          const currentValue = weightList[i].weight
          if (previousValue > 0) {
            weightList[i] = Object.assign(weightList[i], {
              compare: currentValue - previousValue
            })
          }
          previousValue = currentValue
        })
        weightList.reverse()
        weightListEl.innerHTML = (weightList.map(weightItem => {
          return `<button
        id="weightListBtn"
        type="button"
        class="
          list-group-item list-group-item-action
          d-flex
          align-items-center
          justify-content-between
        "
    >
      <div class="d-flex flex-column w-50">
        <div class="d-flex align-items-baseline">
          <span class="fs-2 fw-bold" id="weight">${weightItem.weight}</span>
          <span class="small ms-1">Kg</span>
        </div>
        <span class="text-gray text-truncate">${(Math.round((weightItem.compare ? weightItem.compare : 0) * 100) / 100).toFixed(1)}Kg</span>
      </div>
      <div class="d-flex align-items-center">
        <span class="text-gray" id="weightDate">${weightItem.actualAt}</span>
        <div class="btn btn-sm btn-icon btn-light ms-3">
          <i class="icon icon-chevron ms-2 text-gray"></i>
        </div>
      </div>
    </button>`
        })).join('')
      }
    }
  }
})

/**
 * Food List
 */
let foodList
const foodTabBtn = document.querySelector('#foodTabBtn')
foodTabBtn.addEventListener('click', function () {
  if (!foodList) {
    ajax.open("GET", contextPath + '/food', true);
    ajax.send();
    ajax.onreadystatechange = function () {
      if (ajax.readyState == 4 && ajax.status == 200) {
        foodList = JSON.parse(ajax.responseText);
        const foodListEl = document.querySelector('#foodList')
        foodListEl.innerHTML = (foodList.map(foodItem => {
          return `<button
        type="button"
        class="
                        list-group-item list-group-item-action
                        d-flex
                        align-items-center
                        justify-content-between
                      "
    >
      <div class="d-flex flex-column w-50">
        <div class="d-flex align-items-baseline">
          <span class="fs-2 fw-bold">${foodItem.caloricGain}</span>
          <span class="small ms-1">cal</span>
        </div>
        <span class="text-gray text-truncate">${foodItem.type}</span>
      </div>
      <div class="d-flex align-items-center">
        <span class="text-gray">${foodItem.actualAt}</span>
        <div class="btn btn-sm btn-icon btn-light ms-3">
          <i class="icon icon-chevron ms-2 text-gray"></i>
        </div>
      </div>
    </button>`
        })).join('')
      }
    }
  }
})

/**
 * Pressure List
 */
let pressureList
const pressureTabBtn = document.querySelector('#pressureTabBtn')
pressureTabBtn.addEventListener('click', function () {
  if (!pressureList) {
    ajax.open("GET", contextPath + '/blood-pressure', true);
    ajax.send();
    ajax.onreadystatechange = function () {
      if (ajax.readyState == 4 && ajax.status == 200) {
        pressureList = JSON.parse(ajax.responseText);
        const pressureListEl = document.querySelector('#pressureList')
        pressureListEl.innerHTML = (pressureList.map(pressureItem => {
          return `<button
        type="button"
        class="
                        list-group-item list-group-item-action
                        d-flex
                        align-items-center
                        justify-content-between
                      "
    >
      <div class="d-flex flex-column w-50">
        <div class="d-flex align-items-baseline">
          <span class="fs-2 fw-bold">${pressureItem.systolicPressure}0/${pressureItem.diastolicPressure}0</span>
          <span class="small ms-1">mmHg</span>
        </div>
      </div>
      <div class="d-flex align-items-center">
        <span class="text-gray">${pressureItem.actualAt}</span>
        <div class="btn btn-sm btn-icon btn-light ms-3">
          <i class="icon icon-chevron ms-2 text-gray"></i>
        </div>
      </div>
    </button>`
        })).join('')
      }
    }
  }
})

/**
 * Activity List
 */
let activityList
const activityTabBtn = document.querySelector('#activityTabBtn')
activityTabBtn.addEventListener('click', function () {
  if (!activityList) {
    ajax.open("GET", contextPath + '/activity', true);
    ajax.send();
    ajax.onreadystatechange = function () {
      if (ajax.readyState == 4 && ajax.status == 200) {
        activityList = JSON.parse(ajax.responseText);
        const activityListEl = document.querySelector('#activityList')
        activityListEl.innerHTML = (activityList.map(activityItem => {
          return `<button
        type="button"
        class="
                        list-group-item list-group-item-action
                        d-flex
                        align-items-center
                        justify-content-between
                      "
    >
      <div class="d-flex flex-column w-50">
        <div class="d-flex align-items-baseline">
          <span class="fs-2 fw-bold">${activityItem.caloricLoss}</span>
          <span class="small ms-1">cal</span>
        </div>
        <span class="text-gray text-truncate">${activityItem.description}</span>
      </div>
      <div class="d-flex align-items-center">
        <span class="text-gray">${activityItem.actualAt}</span>
        <div class="btn btn-sm btn-icon btn-light ms-3">
          <i class="icon icon-chevron ms-2 text-gray"></i>
        </div>
      </div>
    </button>`
        })).join('')
      }
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
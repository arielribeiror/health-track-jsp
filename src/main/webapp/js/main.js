const ajax = new XMLHttpRequest();
const contextPath = window.location.pathname.substring(0, window.location.pathname.indexOf("/", 2));

/**
 * User
 */
function getUserByUsername() {
  ajax.open("GET", contextPath + '/user', true);
  ajax.send();
  ajax.onreadystatechange = function () {
    if (ajax.readyState === 4 && ajax.status === 200) {
      const user = JSON.parse(ajax.responseText);
      console.log(user);
    }
  }
}

/**
 * Weight List
 */
let weightList
const trackingTab = document.querySelector('#trackingTab')

function getWeightList() {
  ajax.open("GET", contextPath + '/weight', true);
  ajax.send();
  ajax.onreadystatechange = function () {
    if (ajax.readyState === 4 && ajax.status === 200) {
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

trackingTab.addEventListener('click', function () {
  if (!weightList) {
    getWeightList();
  }
})

/**
 * Food List
 */
let foodList
const foodTabBtn = document.querySelector('#foodTabBtn')

function getFoodList() {
  ajax.open("GET", contextPath + '/food', true);
  ajax.send();
  ajax.onreadystatechange = function () {
    if (ajax.readyState === 4 && ajax.status === 200) {
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
        <span class="text-gray text-truncate">${foodItem.description}</span>
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

foodTabBtn.addEventListener('click', function () {
  if (!foodList) {
    getFoodList();
  }
})

/**
 * Pressure List
 */
let pressureList
const pressureTabBtn = document.querySelector('#pressureTabBtn')

function getPressureList() {
  ajax.open("GET", contextPath + '/blood-pressure', true);
  ajax.send();
  ajax.onreadystatechange = function () {
    if (ajax.readyState === 4 && ajax.status === 200) {
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
          <span class="fs-2 fw-bold">${pressureItem.systolicPressure}/${pressureItem.diastolicPressure}</span>
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

pressureTabBtn.addEventListener('click', function () {
  if (!pressureList) {
    getPressureList();
  }
})

/**
 * Activity List
 */
let activityList
const activityTabBtn = document.querySelector('#activityTabBtn')

function getActivityList() {
  ajax.open("GET", contextPath + '/activity', true);
  ajax.send();
  ajax.onreadystatechange = function () {
    if (ajax.readyState === 4 && ajax.status === 200) {
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

activityTabBtn.addEventListener('click', function () {
  if (!activityList) {
    getActivityList();
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
          getFoodType()
          foodFormTrack.style.display = 'block'
          break
        case 'pressureOption':
          pressureFormTrack.style.display = 'block'
          break
        case 'activityOption':
          getActivityType()
          activityFormTrack.style.display = 'block'
          break
      }
    }
  })
}

const newTrackModalEl = document.querySelector('#newTrackModal')
const newTrackModal = new bootstrap.Modal(document.querySelector('#newTrackModal'))
const carouselNewTrackBackBtn = document.querySelector('#carouselNewTrackBackBtn')

const forms = document.querySelectorAll('.needs-validation')

function resetForms() {
  const trackTypeForm = document.querySelector('#trackTypeForm')
  const carouselNewTrack = document.querySelector('#carouselNewTrack')
  const carousel = new bootstrap.Carousel(carouselNewTrack);
  carousel.to(0)
  trackTypeForm.reset()
  forms.forEach(form => {
    form.reset()
  })
  newTrackCarouselNextBtn.disabled = true
}

newTrackModalEl.addEventListener('hidden.bs.modal', function (event) {
  resetForms();
})

carouselNewTrackBackBtn.addEventListener('click', function () {
  resetForms();
})

/**
 * Food Type List (Select Options)
 */
function getFoodType() {
  let foodTypeList
  if (!foodTypeList) {
    ajax.open("GET", contextPath + '/food-type', true);
    ajax.send();
    ajax.onreadystatechange = function () {
      if (ajax.readyState === 4 && ajax.status === 200) {
        foodTypeList = JSON.parse(ajax.responseText);
        const foodType = document.querySelector('#foodType')
        foodTypeList.forEach(foodTypeItem => {
          foodType.options[foodType.options.length] = new Option(foodTypeItem.type, foodTypeItem.typeId)
        })
      }
    }
  }
}

/**
 * Activity Type List (Select Options)
 */
function getActivityType() {
  let activityTypeList
  if (!activityTypeList) {
    ajax.open("GET", contextPath + '/activity-type', true);
    ajax.send();
    ajax.onreadystatechange = function () {
      if (ajax.readyState === 4 && ajax.status === 200) {
        activityTypeList = JSON.parse(ajax.responseText);
        const activityType = document.querySelector('#activityType')
        activityTypeList.forEach(activityTypeItem => {
          activityType.options[activityType.options.length] = new Option(activityTypeItem.type, activityTypeItem.typeId)
        })
      }
    }
  }
}

/**
 * New Track Save
 * */
const trackAddBtn = document.querySelector('#trackAddBtn')
const toastMessage = document.querySelector('#successToast')
toastMessage.style.display = 'none'
trackAddBtn.addEventListener('click', function () {
  forms.forEach(form => {
    form.classList.add('was-validated')
  })
  for (const trackListOption of trackListOptions) {
    if (trackListOption.checked) {
      switch (trackListOption.id) {
        case 'weightOption':
          postWeight()
          break
        case 'foodOption':
          postFood()
          break
        case 'pressureOption':
          postPressure()
          break
        case 'activityOption':
          postActivity()
          break
      }
    }
  }
})

/**
 * FormData to JSON Converter
 * @param formData
 * @returns {{}}
 */
function formDataToJson(formData) {
  let object = {};
  formData.forEach((value, key) => {
    if (!Reflect.has(object, key)) {
      object[key] = value;
      return;
    }
    if (!Array.isArray(object[key])) {
      object[key] = [object[key]];
    }
    object[key].push(value);
  });
  return object;
}

function jsonRequestHeaders() {
  ajax.setRequestHeader("Content-type", "application/json");
}

function closeModal() {
  newTrackModal.hide()
  toastMessage.style.display = 'block'
  const toast = new bootstrap.Toast(toastMessage)
  toast.show()
  toastMessage.addEventListener('hide.bs.toast', function () {
    toastMessage.style.display = 'none'
  })
}

/**
 * New Weight Track (POST)
 */

function postWeight() {
  const formData = new FormData(document.querySelector('#weightForm'))
  let object = formDataToJson(formData);
  ajax.open("POST", contextPath + '/weight', true);
  jsonRequestHeaders();
  ajax.send(JSON.stringify(object));
  ajax.onreadystatechange = function () {
    if (ajax.readyState === 4 && ajax.status === 200) {
      const weightItem = JSON.parse(ajax.responseText)
      console.log(weightItem)
      closeModal();
      getWeightList()
    }
  }
}

/**
 * New Food Track (POST)
 */

function postFood() {
  const formData = new FormData(document.querySelector('#foodForm'))
  let object = formDataToJson(formData);
  ajax.open("POST", contextPath + '/food', true);
  jsonRequestHeaders();
  ajax.send(JSON.stringify(object));
  ajax.onreadystatechange = function () {
    if (ajax.readyState === 4 && ajax.status === 200) {
      const foodItem = JSON.parse(ajax.responseText)
      console.log(foodItem)
      closeModal();
      getFoodList()
    }
  }
}

/**
 * New Blood Pressure Track (POST)
 */

function postPressure() {
  const formData = new FormData(document.querySelector('#pressureForm'))
  let object = formDataToJson(formData);
  ajax.open("POST", contextPath + '/blood-pressure', true);
  jsonRequestHeaders();
  ajax.send(JSON.stringify(object));
  ajax.onreadystatechange = function () {
    if (ajax.readyState === 4 && ajax.status === 200) {
      const pressureItem = JSON.parse(ajax.responseText)
      console.log(pressureItem)
      closeModal();
      getPressureList()
    }
  }
}

/**
 * New Activity Track (POST)
 */

function postActivity() {
  const formData = new FormData(document.querySelector('#activityForm'))
  let object = formDataToJson(formData);
  ajax.open("POST", contextPath + '/activity', true);
  jsonRequestHeaders();
  ajax.send(JSON.stringify(object));
  ajax.onreadystatechange = function () {
    if (ajax.readyState === 4 && ajax.status === 200) {
      const activityItem = JSON.parse(ajax.responseText)
      console.log(activityItem)
      closeModal();
      getActivityList()
    }
  }
}
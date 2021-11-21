/**
 * New Register Modal
 */
const newTrackCarouselNextBtn = document.querySelector('#newTrackCarouselNextBtn')
const carouselNewTrack = document.querySelector('#carouselNewTrack')
const trackListOption = document.querySelector('input[name="list-option"]:checked')
newTrackCarouselNextBtn.addEventListener('click', function () {
  if (trackListOption) {
    const carousel = new bootstrap.Carousel(carouselNewTrack)
    carousel.next()
  }
})

/**
 * Toast Message
 * */
const toastTrigger = document.querySelector('#successToastBtn')
const toastMessage = document.querySelector('#successToast')
toastTrigger.addEventListener('click', function () {
  const toast = new bootstrap.Toast(toastMessage)
  toast.show()
})
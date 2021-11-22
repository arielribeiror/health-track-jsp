<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<ul class="nav nav-pills pb-3" id="tabTracking" role="tablist">
  <li class="nav-item" role="presentation">
    <button
        class="nav-link active d-flex align-items-center"
        id="weight-tab"
        data-bs-toggle="tab"
        data-bs-target="#weightTab"
        type="button"
        role="tab"
        aria-controls="weight"
        aria-selected="true"
    >
      <i class="icon icon-body-weight me-2"></i>
      <span>Peso</span>
    </button>
  </li>
  <li class="nav-item" role="presentation">
    <button
        class="nav-link d-flex align-items-center"
        id="food-tab"
        data-bs-toggle="tab"
        data-bs-target="#foodTab"
        type="button"
        role="tab"
        aria-controls="food"
        aria-selected="false"
    >
      <i class="icon icon-chicken-leg me-2"></i>
      <span>Alimentação</span>
    </button>
  </li>
  <li class="nav-item" role="presentation">
    <button
        class="nav-link d-flex align-items-center"
        id="pressure-tab"
        data-bs-toggle="tab"
        data-bs-target="#pressureTab"
        type="button"
        role="tab"
        aria-controls="pressure"
        aria-selected="false"
    >
      <i class="icon icon-heart-beats me-2"></i>
      <span>Pressão Arterial</span>
    </button>
  </li>
  <li class="nav-item" role="presentation">
    <button
        class="nav-link d-flex align-items-center"
        id="exercise-tab"
        data-bs-toggle="tab"
        data-bs-target="#exerciseTab"
        type="button"
        role="tab"
        aria-controls="exercise"
        aria-selected="false"
    >
      <i class="icon icon-flash me-2"></i>
      <span>Exercício Físico</span>
    </button>
  </li>
</ul>
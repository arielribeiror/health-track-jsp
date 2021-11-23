<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<menu>
  <ul class="nav nav-pills nav-fill py-1" id="tabnav" role="tablist">
    <li class="nav-item" role="presentation">
      <button
          class="nav-link active"
          id="homeTab"
          data-bs-toggle="tab"
          data-bs-target="#home"
          type="button"
          role="tab"
          aria-controls="home"
          aria-selected="true"
      >
        <i class="icon icon-dashboard"></i>
      </button>
    </li>
    <li class="nav-item" role="presentation">
      <button
          class="nav-link"
          id="trackingTab"
          data-bs-toggle="tab"
          data-bs-target="#tracking"
          type="button"
          role="tab"
          aria-controls="lists"
          aria-selected="false"
      >
        <i class="icon icon-bulleted-list"></i>
      </button>
    </li>
    <li class="nav-item" role="presentation">
      <button
          class="btn btn-icon btn-md btn-secondary"
          id="newTab"
          type="button"
          role="tab"
          aria-controls="new"
          aria-selected="false"
          data-bs-toggle="modal"
          data-bs-target="#newTrackModal"
      >
        <i class="icon icon-plus"></i>
      </button>
    </li>
    <li class="nav-item" role="presentation">
      <button
          class="nav-link"
          id="reportTab"
          data-bs-toggle="tab"
          data-bs-target="#report"
          type="button"
          role="tab"
          aria-controls="report"
          aria-selected="false"
      >
        <i class="icon icon-pie-chart"></i>
      </button>
    </li>
    <li class="nav-item" role="presentation">
      <button
          class="nav-link rounded-circle"
          id="profileTab"
          data-bs-toggle="tab"
          data-bs-target="#profile"
          type="button"
          role="tab"
          aria-controls="profile"
          aria-selected="false"
      >
        <img
            src="../assets/images/avatar.jpg"
            class="rounded-circle avatar-sm"
            alt="Ariel Ribeiro"
        />
      </button>
    </li>
  </ul>
</menu>
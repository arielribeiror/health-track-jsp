<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Health Track - Dashboard</title>

    <link rel="stylesheet" href="../css/main.css" />
    <link rel="stylesheet" href="../css/style.css" />
  </head>
  <body>
    <div
      class="modal fade"
      id="newListItemModal"
      tabindex="-1"
      aria-labelledby="newListItemModalLabel"
      aria-hidden="true"
    >
     <div class="modal-dialog modal-dialog-centered">
        <div class="modal-content">
          <div class="modal-header" data-bs-dismiss="modal">
            <button type="button" class="btn-close" aria-label="Close"></button>
          </div>
          <div
            id="carouselLoginControls"
            class="carousel carousel-dark slide"
            data-bs-ride="carousel"
            data-bs-interval="false"
          >
            <div class="carousel-inner">
              <div class="carousel-item active">
                <div class="modal-body" style="height: calc(100vh - 160px)">
                  <div class="text-center mb-4">
                    <span class="fs-2 fw-bold">O que deseja registrar?</span>
                  </div>
                  <form>
                    <div class="position-relative">
                      <input
                        class="form-check-input"
                        type="radio"
                        name="list-option"
                        id="weight-option"
                      />
                      <label
                        class="
                          form-check-label
                          d-flex
                          justify-content-between
                          align-items-center
                          p-3
                        "
                        for="weight-option"
                      >
                        <div class="d-flex flex-column me-3">
                          <span class="fs-3 fw-bold">Peso</span>
                          <span>
                            Selecione para inserir seu peso atual ou de dias
                            anteriores.
                          </span>
                        </div>
                        <i class="icon icon-body-weight icon-36"></i>
                      </label>
                    </div>
                    <div class="position-relative">
                      <input
                        class="form-check-input"
                        type="radio"
                        name="list-option"
                        id="food-option"
                      />
                      <label
                        class="
                          form-check-label
                          d-flex
                          justify-content-between
                          align-items-center
                          p-3
                        "
                        for="food-option"
                      >
                        <div class="d-flex flex-column me-3">
                          <span class="fs-3 fw-bold">Alimentação</span>
                          <span>
                            Selecione para inserir os alimentos ingeridos no dia
                            ou em uma refeição e seus respectivos valores
                            nutricionais.
                          </span>
                        </div>
                        <i class="icon icon-chicken-leg icon-36"></i>
                      </label>
                    </div>
                    <div class="position-relative">
                      <input
                        class="form-check-input"
                        type="radio"
                        name="list-option"
                        id="pressure-option"
                      />
                      <label
                        class="
                          form-check-label
                          d-flex
                          justify-content-between
                          align-items-center
                          p-3
                        "
                        for="pressure-option"
                      >
                        <div class="d-flex flex-column me-3">
                          <span class="fs-3 fw-bold">Pressão Arterial</span>
                          <span>
                            Selecione para inserir a medição da sua pressão
                            sistólica e diastólica.
                          </span>
                        </div>
                        <i class="icon icon-heart-beats icon-36"></i>
                      </label>
                    </div>
                    <div class="position-relative">
                      <input
                        class="form-check-input"
                        type="radio"
                        name="list-option"
                        id="exercise-option"
                      />
                      <label
                        class="
                          form-check-label
                          d-flex
                          justify-content-between
                          align-items-center
                          p-3
                        "
                        for="exercise-option"
                      >
                        <div class="d-flex flex-column me-3">
                          <span class="fs-3 fw-bold">Exercício Físico</span>
                          <span>
                            Selecione para inserir qual modalidade de exercício
                            praticou, calorias perdidas, entre outros dados.
                          </span>
                        </div>
                        <i class="icon icon-flash icon-36"></i>
                      </label>
                    </div>
                  </form>
                </div>
                <div class="modal-footer">
                  <div class="d-grid w-100">
                    <button
                      type="submit"
                      class="btn btn-secondary btn-lg"
                      data-bs-target="#carouselLoginControls"
                      data-bs-slide="next"
                    >
                      Próximo
                    </button>
                  </div>
                </div>
              </div>
              <div class="carousel-item">
                <div class="modal-body" style="height: calc(100vh - 160px)">
                  <button
                    class="carousel-control-prev text-primary mb-5"
                    type="button"
                    data-bs-target="#carouselLoginControls"
                    data-bs-slide="prev"
                  >
                    <i class="icon icon-chevron icon-flip-y me-2"></i>
                    <span>Voltar</span>
                  </button>
                  <div class="d-flex align-items-center text-primary mb-4">
                    <i class="icon icon-body-weight icon-36 me-4"></i>
                    <span class="fs-3 fw-bold">Peso</span>
                  </div>
                  <form>
                    <div class="mb-3">
                      <label for="listItemWeight" class="form-label">
                        Digite o peso em Kg
                      </label>
                      <input
                        type="number"
                        step="0.1"
                        id="listItemWeight"
                        class="form-control form-control-lg"
                        placeholder="Digite seu peso atual"
                      />
                    </div>
                    <div class="mb-3">
                      <label for="listItemWeightDate" class="form-label">
                        Data
                      </label>
                      <input
                        type="date"
                        id="listItemWeightDate"
                        class="form-control form-control-lg"
                        placeholder="Selecione a data"
                      />
                    </div>
                  </form>
                </div>
                </div>
            </div>
          </div>
        </div>
      </div>
    </div>
     <div id="sucessToast" class="position-fixed toast align-items-center text-white bg-success bottom-0 border-0 mx-1 mb-3" role="alert" aria-live="assertive" aria-atomic="true">
		  <div class="d-flex">
		    <div class="toast-body">
		     Adicionado com sucesso!
		    </div>
		    <button type="button" class="btn-close btn-close-white me-2 m-auto" data-bs-dismiss="toast" aria-label="Close"></button>
		  </div>
		</div>
    <div class="container d-grid">
      <header>
        <div class="toolbar justify-content-between">
          <div class="d-flex align-items-center">
            <img
              src="../images/avatar.jpg"
              class="rounded-circle avatar-sm me-2"
              alt="Ariel Ribeiro"
            />
            <span>Ariel Ribeiro</span>,
            <span class="text-gray ms-1">29 anos</span>
          </div>
          <button type="button" class="btn btn-light btn-sm btn-icon">
            <i class="icon icon-notification"></i>
          </button>
        </div>
      </header>

      <main>
        <section class="h-100">
          <div class="tab-content h-100" id="tabnavContent">
            <div
              class="tab-pane fade show active"
              id="home"
              role="tabpanel"
              aria-labelledby="home-tab"
            >
              <div class="alert alert-info">
                <div class="d-flex align-items-center">
                  <div class="flex-shrink-0">
                    <i
                      class="icon icon-information-point text-info icon-24"
                    ></i>
                  </div>
                  <div class="flex-grow-1 ms-3">
                    <p class="text-dark fw-bold">
                      Você está há 5 dias sem fazer exercícios!
                    </p>
                    <p class="text-dark">
                      Apenas 5 minutos de exercício pesado, ou 30 minutos de
                      exercício leve, é o suficiente para ter uma vida mais
                      saudável.
                    </p>
                  </div>
                </div>
              </div>
              <section>
                <div class="row">
                  <div class="col-xl-3 col-lg-4 col-md-4 col-sm-6 col-6">
                    <div class="card text-white bg-secondary border-0">
                      <div
                        class="
                          card-header
                          d-flex
                          align-items-center
                          border-0
                          bg-secondary
                        "
                      >
                        <i class="icon icon-big-ruler me-2"></i>
                        <span class="fw-bold">IMC</span>
                      </div>
                      <div class="card-body">
                        <span class="card-title fs-1 fw-bold"> 21 </span>
                        <p class="card-text">Peso ideal</p>
                        <div class="chart light">
                          <div style="height: 54px"></div>
                          <div style="height: 48px"></div>
                          <div style="height: 50px"></div>
                          <div style="height: 48px"></div>
                          <div style="height: 52px"></div>
                          <div style="height: 54px"></div>
                          <div style="height: 50px"></div>
                          <div style="height: 54px"></div>
                          <div style="height: 48px"></div>
                          <div style="height: 50px"></div>
                          <div style="height: 48px"></div>
                          <div style="height: 54px"></div>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div class="col-xl-3 col-lg-4 col-md-4 col-sm-6 col-6">
                    <div class="card text-dark bg-light border-0">
                      <div
                        class="
                          card-header
                          d-flex
                          align-items-center
                          border-0
                          bg-light
                          justify-content-between
                        "
                      >
                        <div class="d-flex align-items-center">
                          <i class="icon icon-body-weight me-2"></i>
                          <span class="fw-bold">Peso</span>
                        </div>
                        <span class="small">há 5 dias</span>
                      </div>
                      <div class="card-body">
                        <span class="card-title fs-1 fw-bold">60,1</span>
                        <span class="small">Kg</span>
                        <p class="card-text">+1Kg</p>
                        <div class="chart dark">
                          <div style="height: 54px"></div>
                          <div style="height: 48px"></div>
                          <div style="height: 50px"></div>
                          <div style="height: 48px"></div>
                          <div style="height: 52px"></div>
                          <div style="height: 54px"></div>
                          <div style="height: 50px"></div>
                          <div style="height: 54px"></div>
                          <div style="height: 48px"></div>
                          <div style="height: 50px"></div>
                          <div style="height: 48px"></div>
                          <div style="height: 54px"></div>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div class="col-xl-3 col-lg-4 col-md-4 col-sm-6 col-6">
                    <div class="card text-white bg-primary border-0">
                      <div
                        class="
                          card-header
                          d-flex
                          align-items-center
                          border-0
                          bg-primary
                          justify-content-between
                        "
                      >
                        <div class="d-flex align-items-center">
                          <i class="icon icon-heart-beats me-2"></i>
                          <span class="fw-bold">Pressão</span>
                        </div>
                        <span class="small" style="font-size: 75%"
                          >há 3 dias</span
                        >
                      </div>
                      <div class="card-body">
                        <span class="card-title fs-1 fw-bold"> 100/70 </span>
                        <p class="card-text">mmHg</p>
                        <div class="chart light">
                          <div style="height: 54px"></div>
                          <div style="height: 48px"></div>
                          <div style="height: 50px"></div>
                          <div style="height: 48px"></div>
                          <div style="height: 52px"></div>
                          <div style="height: 54px"></div>
                          <div style="height: 50px"></div>
                          <div style="height: 54px"></div>
                          <div style="height: 48px"></div>
                          <div style="height: 50px"></div>
                          <div style="height: 48px"></div>
                          <div style="height: 54px"></div>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div class="col"></div>
                </div>
              </section>
            </div>
            <div
              class="tab-pane fade"
              id="lists"
              role="tabpanel"
              aria-labelledby="lists-tab"
            >
              <ul class="nav nav-pills pb-3" id="tabLists" role="tablist">
                <li class="nav-item" role="presentation">
                  <button
                    class="nav-link active d-flex align-items-center"
                    id="weight-tab"
                    data-bs-toggle="tab"
                    data-bs-target="#weight"
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
                    data-bs-target="#food"
                    type="button"
                    role="tab"
                    aria-controls="food"
                    aria-selected="true"
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
                    data-bs-target="#pressure"
                    type="button"
                    role="tab"
                    aria-controls="pressure"
                    aria-selected="true"
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
                    data-bs-target="#exercise"
                    type="button"
                    role="tab"
                    aria-controls="exercise"
                    aria-selected="true"
                  >
                    <i class="icon icon-flash me-2"></i>
                    <span>Exercício Físico</span>
                  </button>
                </li>
              </ul>
              <div class="tab-content" id="tabListsContent">
                <div
                  class="tab-pane fade show active"
                  id="weight"
                  role="tabpanel"
                  aria-labelledby="weight-tab"
                >
                  <div class="list-group list-group-flush">
                    <button
                      type="button"
                      class="
                        list-group-item list-group-item-action
                        d-flex
                        align-items-center
                        justify-content-between
                      "
                    >
                      <div class="d-flex flex-column">
                        <div class="d-flex align-items-baseline">
                          <span class="fs-2 fw-bold">60,1</span>
                          <span class="small ms-1">Kg</span>
                        </div>
                        <span class="text-gray">-0,1Kg</span>
                      </div>
                      <div class="d-flex align-items-center">
                        <span class="text-gray">18 de Abril</span>
                        <div class="btn btn-sm btn-icon btn-light ms-3">
                          <i class="icon icon-chevron ms-2 text-gray"></i>
                        </div>
                      </div>
                    </button>
                    <button
                      type="button"
                      class="
                        list-group-item list-group-item-action
                        d-flex
                        align-items-center
                        justify-content-between
                      "
                    >
                      <div class="d-flex flex-column">
                        <div class="d-flex align-items-baseline">
                          <span class="fs-2 fw-bold">60,2</span>
                          <span class="small ms-1">Kg</span>
                        </div>
                        <span class="text-gray">+0,2Kg</span>
                      </div>
                      <div class="d-flex align-items-center">
                        <span class="text-gray">17 de Abril</span>
                        <div class="btn btn-sm btn-icon btn-light ms-3">
                          <i class="icon icon-chevron ms-2 text-gray"></i>
                        </div>
                      </div>
                    </button>
                    <button
                      type="button"
                      class="
                        list-group-item list-group-item-action
                        d-flex
                        align-items-center
                        justify-content-between
                      "
                    >
                      <div class="d-flex flex-column">
                        <div class="d-flex align-items-baseline">
                          <span class="fs-2 fw-bold">60,0</span>
                          <span class="small ms-1">Kg</span>
                        </div>
                        <span class="text-gray">-0,1Kg</span>
                      </div>
                      <div class="d-flex align-items-center">
                        <span class="text-gray">16 de Abril</span>
                        <div class="btn btn-sm btn-icon btn-light ms-3">
                          <i class="icon icon-chevron ms-2 text-gray"></i>
                        </div>
                      </div>
                    </button>
                    <button
                      type="button"
                      class="
                        list-group-item list-group-item-action
                        d-flex
                        align-items-center
                        justify-content-between
                      "
                    >
                      <div class="d-flex flex-column">
                        <div class="d-flex align-items-baseline">
                          <span class="fs-2 fw-bold">60,1</span>
                          <span class="small ms-1">Kg</span>
                        </div>
                        <span class="text-gray">+0,7Kg</span>
                      </div>
                      <div class="d-flex align-items-center">
                        <span class="text-gray">15 de Abril</span>
                        <div class="btn btn-sm btn-icon btn-light ms-3">
                          <i class="icon icon-chevron ms-2 text-gray"></i>
                        </div>
                      </div>
                    </button>
                    <button
                      type="button"
                      class="
                        list-group-item list-group-item-action
                        d-flex
                        align-items-center
                        justify-content-between
                      "
                    >
                      <div class="d-flex flex-column">
                        <div class="d-flex align-items-baseline">
                          <span class="fs-2 fw-bold">59,4</span>
                          <span class="small ms-1">Kg</span>
                        </div>
                        <span class="text-gray">+0,3Kg</span>
                      </div>
                      <div class="d-flex align-items-center">
                        <span class="text-gray">10 de Abril</span>
                        <div class="btn btn-sm btn-icon btn-light ms-3">
                          <i class="icon icon-chevron ms-2 text-gray"></i>
                        </div>
                      </div>
                    </button>
                    <button
                      type="button"
                      class="
                        list-group-item list-group-item-action
                        d-flex
                        align-items-center
                        justify-content-between
                      "
                    >
                      <div class="d-flex flex-column">
                        <div class="d-flex align-items-baseline">
                          <span class="fs-2 fw-bold">59,1</span>
                          <span class="small ms-1">Kg</span>
                        </div>
                        <span class="text-gray">+0Kg</span>
                      </div>
                      <div class="d-flex align-items-center">
                        <span class="text-gray">08 de Abril</span>
                        <div class="btn btn-sm btn-icon btn-light ms-3">
                          <i class="icon icon-chevron ms-2 text-gray"></i>
                        </div>
                      </div>
                    </button>
                    <button
                      type="button"
                      class="
                        list-group-item list-group-item-action
                        d-flex
                        align-items-center
                        justify-content-between
                      "
                    >
                      <div class="d-flex flex-column">
                        <div class="d-flex align-items-baseline">
                          <span class="fs-2 fw-bold">59,1</span>
                          <span class="small ms-1">Kg</span>
                        </div>
                        <span class="text-gray">-1Kg</span>
                      </div>
                      <div class="d-flex align-items-center">
                        <span class="text-gray">07 de Abril</span>
                        <div class="btn btn-sm btn-icon btn-light ms-3">
                          <i class="icon icon-chevron ms-2 text-gray"></i>
                        </div>
                      </div>
                    </button>
                    <button
                      type="button"
                      class="
                        list-group-item list-group-item-action
                        d-flex
                        align-items-center
                        justify-content-between
                      "
                    >
                      <div class="d-flex flex-column">
                        <div class="d-flex align-items-baseline">
                          <span class="fs-2 fw-bold">60,1</span>
                          <span class="small ms-1">Kg</span>
                        </div>
                        <span class="text-gray">+0Kg</span>
                      </div>
                      <div class="d-flex align-items-center">
                        <span class="text-gray">29 de Março</span>
                        <div class="btn btn-sm btn-icon btn-light ms-3">
                          <i class="icon icon-chevron ms-2 text-gray"></i>
                        </div>
                      </div>
                    </button>
                    <button
                      type="button"
                      class="
                        list-group-item list-group-item-action
                        d-flex
                        align-items-center
                        justify-content-between
                      "
                    >
                      <div class="d-flex flex-column">
                        <div class="d-flex align-items-baseline">
                          <span class="fs-2 fw-bold">60,1</span>
                          <span class="small ms-1">Kg</span>
                        </div>
                        <span class="text-gray">+0,4Kg</span>
                      </div>
                      <div class="d-flex align-items-center">
                        <span class="text-gray">28 de Março</span>
                        <div class="btn btn-sm btn-icon btn-light ms-3">
                          <i class="icon icon-chevron ms-2 text-gray"></i>
                        </div>
                      </div>
                    </button>
                    <button
                      type="button"
                      class="
                        list-group-item list-group-item-action
                        d-flex
                        align-items-center
                        justify-content-between
                      "
                    >
                      <div class="d-flex flex-column">
                        <div class="d-flex align-items-baseline">
                          <span class="fs-2 fw-bold">59,7</span>
                          <span class="small ms-1">Kg</span>
                        </div>
                        <span class="text-gray">+1Kg</span>
                      </div>
                      <div class="d-flex align-items-center">
                        <span class="text-gray">27 de Março</span>
                        <div class="btn btn-sm btn-icon btn-light ms-3">
                          <i class="icon icon-chevron ms-2 text-gray"></i>
                        </div>
                      </div>
                    </button>
                  </div>
                </div>
                <div
                  class="tab-pane fade"
                  id="food"
                  role="tabpanel"
                  aria-labelledby="food-tab"
                >
                  <div class="list-group list-group-flush">
                    <button
                      type="button"
                      class="
                        list-group-item list-group-item-action
                        d-flex
                        align-items-center
                        justify-content-between
                      "
                    >
                      <div class="d-flex flex-column">
                        <div class="d-flex align-items-baseline">
                          <span class="fs-2 fw-bold">254</span>
                          <span class="small ms-1">cal</span>
                        </div>
                        <span class="text-gray">Pão com mortadela</span>
                      </div>
                      <div class="d-flex align-items-center">
                        <span class="text-gray">18 de Abril</span>
                        <div class="btn btn-sm btn-icon btn-light ms-3">
                          <i class="icon icon-chevron ms-2 text-gray"></i>
                        </div>
                      </div>
                    </button>
                    <button
                      type="button"
                      class="
                        list-group-item list-group-item-action
                        d-flex
                        align-items-center
                        justify-content-between
                      "
                    >
                      <div class="d-flex flex-column">
                        <div class="d-flex align-items-baseline">
                          <span class="fs-2 fw-bold">1184</span>
                          <span class="small ms-1">cal</span>
                        </div>
                        <span class="text-gray">Lanche McDonalds</span>
                      </div>
                      <div class="d-flex align-items-center">
                        <span class="text-gray">17 de Abril</span>
                        <div class="btn btn-sm btn-icon btn-light ms-3">
                          <i class="icon icon-chevron ms-2 text-gray"></i>
                        </div>
                      </div>
                    </button>
                    <button
                      type="button"
                      class="
                        list-group-item list-group-item-action
                        d-flex
                        align-items-center
                        justify-content-between
                      "
                    >
                      <div class="d-flex flex-column">
                        <div class="d-flex align-items-baseline">
                          <span class="fs-2 fw-bold">789</span>
                          <span class="small ms-1">cal</span>
                        </div>
                        <span class="text-gray">Almoço</span>
                      </div>
                      <div class="d-flex align-items-center">
                        <span class="text-gray">16 de Abril</span>
                        <div class="btn btn-sm btn-icon btn-light ms-3">
                          <i class="icon icon-chevron ms-2 text-gray"></i>
                        </div>
                      </div>
                    </button>
                    <button
                      type="button"
                      class="
                        list-group-item list-group-item-action
                        d-flex
                        align-items-center
                        justify-content-between
                      "
                    >
                      <div class="d-flex flex-column">
                        <div class="d-flex align-items-baseline">
                          <span class="fs-2 fw-bold">97</span>
                          <span class="small ms-1">cal</span>
                        </div>
                        <span class="text-gray">Café da manhã</span>
                      </div>
                      <div class="d-flex align-items-center">
                        <span class="text-gray">16 de Abril</span>
                        <div class="btn btn-sm btn-icon btn-light ms-3">
                          <i class="icon icon-chevron ms-2 text-gray"></i>
                        </div>
                      </div>
                    </button>
                    <button
                      type="button"
                      class="
                        list-group-item list-group-item-action
                        d-flex
                        align-items-center
                        justify-content-between
                      "
                    >
                      <div class="d-flex flex-column">
                        <div class="d-flex align-items-baseline">
                          <span class="fs-2 fw-bold">947</span>
                          <span class="small ms-1">cal</span>
                        </div>
                        <span class="text-gray">Jantar completo</span>
                      </div>
                      <div class="d-flex align-items-center">
                        <span class="text-gray">15 de Abril</span>
                        <div class="btn btn-sm btn-icon btn-light ms-3">
                          <i class="icon icon-chevron ms-2 text-gray"></i>
                        </div>
                      </div>
                    </button>
                  </div>
                </div>
                <div
                  class="tab-pane fade"
                  id="pressure"
                  role="tabpanel"
                  aria-labelledby="pressure-tab"
                >
                  <div class="list-group list-group-flush">
                    <button
                      type="button"
                      class="
                        list-group-item list-group-item-action
                        d-flex
                        align-items-center
                        justify-content-between
                      "
                    >
                      <div class="d-flex flex-column">
                        <div class="d-flex align-items-baseline">
                          <span class="fs-2 fw-bold">100/70</span>
                          <span class="small ms-1">mmHg</span>
                        </div>
                        <span class="text-gray">Logo ao despertar</span>
                      </div>
                      <div class="d-flex align-items-center">
                        <span class="text-gray">18 de Abril</span>
                        <div class="btn btn-sm btn-icon btn-light ms-3">
                          <i class="icon icon-chevron ms-2 text-gray"></i>
                        </div>
                      </div>
                    </button>
                    <button
                      type="button"
                      class="
                        list-group-item list-group-item-action
                        d-flex
                        align-items-center
                        justify-content-between
                      "
                    >
                      <div class="d-flex flex-column">
                        <div class="d-flex align-items-baseline">
                          <span class="fs-2 fw-bold">100/70</span>
                          <span class="small ms-1">mmHg</span>
                        </div>
                        <span class="text-gray">Indo deitar</span>
                      </div>
                      <div class="d-flex align-items-center">
                        <span class="text-gray">17 de Abril</span>
                        <div class="btn btn-sm btn-icon btn-light ms-3">
                          <i class="icon icon-chevron ms-2 text-gray"></i>
                        </div>
                      </div>
                    </button>
                    <button
                      type="button"
                      class="
                        list-group-item list-group-item-action
                        d-flex
                        align-items-center
                        justify-content-between
                      "
                    >
                      <div class="d-flex flex-column">
                        <div class="d-flex align-items-baseline">
                          <span class="fs-2 fw-bold">90/60</span>
                          <span class="small ms-1">mmHg</span>
                        </div>
                        <span class="text-gray">Antes do almoço</span>
                      </div>
                      <div class="d-flex align-items-center">
                        <span class="text-gray">16 de Abril</span>
                        <div class="btn btn-sm btn-icon btn-light ms-3">
                          <i class="icon icon-chevron ms-2 text-gray"></i>
                        </div>
                      </div>
                    </button>
                    <button
                      type="button"
                      class="
                        list-group-item list-group-item-action
                        d-flex
                        align-items-center
                        justify-content-between
                      "
                    >
                      <div class="d-flex flex-column">
                        <div class="d-flex align-items-baseline">
                          <span class="fs-2 fw-bold">110/70</span>
                          <span class="small ms-1">mmHg</span>
                        </div>
                        <span class="text-gray">Após almoço</span>
                      </div>
                      <div class="d-flex align-items-center">
                        <span class="text-gray">14 de Abril</span>
                        <div class="btn btn-sm btn-icon btn-light ms-3">
                          <i class="icon icon-chevron ms-2 text-gray"></i>
                        </div>
                      </div>
                    </button>
                    <button
                      type="button"
                      class="
                        list-group-item list-group-item-action
                        d-flex
                        align-items-center
                        justify-content-between
                      "
                    >
                      <div class="d-flex flex-column">
                        <div class="d-flex align-items-baseline">
                          <span class="fs-2 fw-bold">90/60</span>
                          <span class="small ms-1">mmHg</span>
                        </div>
                        <span class="text-gray">Após banho</span>
                      </div>
                      <div class="d-flex align-items-center">
                        <span class="text-gray">13 de Abril</span>
                        <div class="btn btn-sm btn-icon btn-light ms-3">
                          <i class="icon icon-chevron ms-2 text-gray"></i>
                        </div>
                      </div>
                    </button>
                  </div>
                </div>
                <div
                  class="tab-pane fade"
                  id="exercise"
                  role="tabpanel"
                  aria-labelledby="exercise-tab"
                >
                  <div class="list-group list-group-flush">
                    <button
                      type="button"
                      class="
                        list-group-item list-group-item-action
                        d-flex
                        align-items-center
                        justify-content-between
                      "
                    >
                      <div class="d-flex flex-column">
                        <div class="d-flex align-items-baseline">
                          <span class="fs-2 fw-bold">289</span>
                          <span class="small ms-1">cal</span>
                        </div>
                        <span class="text-gray">Subir escadas</span>
                      </div>
                      <div class="d-flex align-items-center">
                        <span class="text-gray">18 de Abril</span>
                        <div class="btn btn-sm btn-icon btn-light ms-3">
                          <i class="icon icon-chevron ms-2 text-gray"></i>
                        </div>
                      </div>
                    </button>
                    <button
                      type="button"
                      class="
                        list-group-item list-group-item-action
                        d-flex
                        align-items-center
                        justify-content-between
                      "
                    >
                      <div class="d-flex flex-column">
                        <div class="d-flex align-items-baseline">
                          <span class="fs-2 fw-bold">475</span>
                          <span class="small ms-1">cal</span>
                        </div>
                        <span class="text-gray">Corrida matinal</span>
                      </div>
                      <div class="d-flex align-items-center">
                        <span class="text-gray">17 de Abril</span>
                        <div class="btn btn-sm btn-icon btn-light ms-3">
                          <i class="icon icon-chevron ms-2 text-gray"></i>
                        </div>
                      </div>
                    </button>
                    <button
                      type="button"
                      class="
                        list-group-item list-group-item-action
                        d-flex
                        align-items-center
                        justify-content-between
                      "
                    >
                      <div class="d-flex flex-column">
                        <div class="d-flex align-items-baseline">
                          <span class="fs-2 fw-bold">167</span>
                          <span class="small ms-1">cal</span>
                        </div>
                        <span class="text-gray">Caminhada pelo bairro</span>
                      </div>
                      <div class="d-flex align-items-center">
                        <span class="text-gray">16 de Abril</span>
                        <div class="btn btn-sm btn-icon btn-light ms-3">
                          <i class="icon icon-chevron ms-2 text-gray"></i>
                        </div>
                      </div>
                    </button>
                    <button
                      type="button"
                      class="
                        list-group-item list-group-item-action
                        d-flex
                        align-items-center
                        justify-content-between
                      "
                    >
                      <div class="d-flex flex-column">
                        <div class="d-flex align-items-baseline">
                          <span class="fs-2 fw-bold">571</span>
                          <span class="small ms-1">cal</span>
                        </div>
                        <span class="text-gray">Natação</span>
                      </div>
                      <div class="d-flex align-items-center">
                        <span class="text-gray">14 de Abril</span>
                        <div class="btn btn-sm btn-icon btn-light ms-3">
                          <i class="icon icon-chevron ms-2 text-gray"></i>
                        </div>
                      </div>
                    </button>
                    <button
                      type="button"
                      class="
                        list-group-item list-group-item-action
                        d-flex
                        align-items-center
                        justify-content-between
                      "
                    >
                      <div class="d-flex flex-column">
                        <div class="d-flex align-items-baseline">
                          <span class="fs-2 fw-bold">346</span>
                          <span class="small ms-1">cal</span>
                        </div>
                        <span class="text-gray">Pedal vespertino</span>
                      </div>
                      <div class="d-flex align-items-center">
                        <span class="text-gray">13 de Abril</span>
                        <div class="btn btn-sm btn-icon btn-light ms-3">
                          <i class="icon icon-chevron ms-2 text-gray"></i>
                        </div>
                      </div>
                    </button>
                  </div>
                </div>
              </div>
            </div>
            <div
              class="tab-pane fade h-100"
              id="report"
              role="tabpanel"
              aria-labelledby="report-tab"
            >
              <div
                class="d-flex align-items-center justify-content-center h-100"
              >
                <span class="text-gray">Novidades em breve.</span>
              </div>
            </div>
            <div
              class="tab-pane fade h-100"
              id="profile"
              role="tabpanel"
              aria-labelledby="profile-tab"
            >
              <div
                class="d-flex align-items-center justify-content-center h-100"
              >
                <span class="text-gray">Novidades em breve.</span>
              </div>
              <div class="position-absolute bottom-0 w-100">
                <div class="list-group list-group-flush">
                  <a
                    href="./index.jsp"
                    class="
                      list-group-item list-group-item-action
                      d-flex
                      align-items-center
                      justify-content-between
                      text-danger
                    "
                    aria-current="true"
                  >
                    <span>Sair do app</span>
                    <div class="btn btn-sm btn-icon btn-light ms-3">
                      <i class="icon icon-chevron ms-2 text-gray"></i>
                    </div>
                  </a>
                </div>
              </div>
            </div>
          </div>
        </section>
      </main>

      <footer>
        <ul class="nav nav-pills nav-fill" id="tabnav" role="tablist">
          <li class="nav-item" role="presentation">
            <button
              class="nav-link active"
              id="home-tab"
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
              id="lists-tab"
              data-bs-toggle="tab"
              data-bs-target="#lists"
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
              id="new-tab"
              type="button"
              role="tab"
              aria-controls="new"
              aria-selected="false"
              data-bs-toggle="modal"
              data-bs-target="#newListItemModal"
            >
              <i class="icon icon-plus"></i>
            </button>
          </li>
          <li class="nav-item" role="presentation">
            <button
              class="nav-link"
              id="report-tab"
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
              id="profile-tab"
              data-bs-toggle="tab"
              data-bs-target="#profile"
              type="button"
              role="tab"
              aria-controls="profile"
              aria-selected="false"
            >
              <img
                src="../images/avatar.jpg"
                class="rounded-circle avatar-sm"
                alt="Ariel Ribeiro"
              />
            </button>
          </li>
        </ul>
      </footer>
    </div>
    <script>
	    const toastTrigger = document.getElementById('sucessToastBtn')
	    console.log(toastTrigger)
	    const toastLiveExample = document.getElementById('sucessToast')
	    if (toastTrigger) {
	      toastTrigger.addEventListener('click', function () {
	        const toast = new bootstrap.Toast(toastLiveExample)
	
	        toast.show()
	      })
	    }
    </script>
    <script src="js/bootstrap.bundle.min.js"></script>
  </body>
</html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div
    class="modal fade"
    id="newTrackModal"
    tabindex="-1"
    aria-hidden="true"
>
  <div class="modal-dialog modal-dialog-centered">
    <div class="modal-content">
      <div class="modal-header" data-bs-dismiss="modal">
        <button type="button" class="btn-close" aria-label="Close"></button>
      </div>
      <div
          id="carouselNewTrack"
          class="carousel carousel-dark slide"
          data-bs-ride="carousel"
          data-bs-interval="false"
      >
        <div class="carousel-inner">
          <div class="carousel-item active">
            <div class="modal-body" style="height: calc(100vh - 210px)">
              <div class="text-center mb-4">
                <span class="fs-2 fw-bold">O que deseja registrar?</span>
              </div>
              <form id="trackTypeForm">
                <div class="position-relative">
                  <input
                      class="form-check-input"
                      type="radio"
                      name="listOption"
                      id="weightOption"
                  />
                  <label
                      class="
                          form-check-label
                          d-flex
                          justify-content-between
                          align-items-center
                          p-3
                        "
                      for="weightOption"
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
                      name="listOption"
                      id="foodOption"
                  />
                  <label
                      class="
                          form-check-label
                          d-flex
                          justify-content-between
                          align-items-center
                          p-3
                        "
                      for="foodOption"
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
                      name="listOption"
                      id="pressureOption"
                  />
                  <label
                      class="
                          form-check-label
                          d-flex
                          justify-content-between
                          align-items-center
                          p-3
                        "
                      for="pressureOption"
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
                      name="listOption"
                      id="activityOption"
                  />
                  <label
                      class="
                          form-check-label
                          d-flex
                          justify-content-between
                          align-items-center
                          p-3
                        "
                      for="activityOption"
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
                    data-bs-target="#carouselNewTrack"
                    data-bs-slide="next"
                    id="newTrackCarouselNextBtn"
                >
                  Próximo
                </button>
                <button
                    type="button"
                    class="btn btn-outline-secondary btn-lg"
                    data-bs-dismiss="modal"
                    aria-label="Close"
                >
                  Fechar
                </button>
              </div>
            </div>
          </div>
          <div class="carousel-item">
            <div class="modal-body" style="height: calc(100vh - 210px)">
              <button
                  class="carousel-control-prev text-primary mb-5"
                  type="button"
                  id="carouselNewTrackBackBtn"
                  data-bs-target="#carouselNewTrack"
              >
                <i class="icon icon-chevron icon-flip-y me-2"></i>
                <span>Voltar</span>
              </button>

              <jsp:include page="form-weight.jsp"></jsp:include>

              <jsp:include page="form-food.jsp"></jsp:include>

              <jsp:include page="form-pressure.jsp"></jsp:include>

              <jsp:include page="form-activity.jsp"></jsp:include>

            </div>
            <div class="modal-footer">
              <div class="d-grid w-100">
                <button
                    type="submit"
                    class="btn btn-secondary btn-lg"
                    id="trackAddBtn"
                >
                  Salvar
                </button>
                <button
                    type="button"
                    class="btn btn-outline-secondary btn-lg"
                    data-bs-dismiss="modal"
                    aria-label="Close"
                >
                  Fechar
                </button>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
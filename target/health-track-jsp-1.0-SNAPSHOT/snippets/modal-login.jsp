<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<div
    class="modal fade"
    id="loginModal"
    tabindex="-1"
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
              <h1>Login</h1>
              <p>Seja bem-vindo!</p>
              <form id="formUser">
                <label for="loginUser" class="form-label">Usuário</label>
                <input
                    type="text"
                    id="loginUser"
                    class="form-control form-control-lg"
                    placeholder="Digite seu usuário"
                />
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
              <form id="formAuth">
                <label for="loginPassword" class="form-label">
                  Senha
                </label>
                <input
                    type="password"
                    id="loginPassword"
                    class="form-control form-control-lg"
                    placeholder="Digite sua senha"
                />
              </form>
            </div>
            <div class="modal-footer">
              <div class="d-grid w-100">
                <a href="./home/" form="formAuth" class="btn btn-secondary btn-lg">
                  Entrar
                </a>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Health Track</title>

    <link rel="stylesheet" href="./css/main.css" />
    <link rel="stylesheet" href="./css/style.css" />
  </head>
  <body>
    <div
      class="modal fade"
      id="loginModal"
      tabindex="-1"
      aria-labelledby="loginModalLabel"
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
                  <form action="dashboard/index.html" method="post">
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
                  <form>
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
                    <a href="./dashboard.jsp" class="btn btn-secondary btn-lg">
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

    <div class="container d-grid">
      <header>
        <div class="toolbar justify-content-center">
          <img
            src="./images/health-track-logo.svg"
            alt="Health Track Logo"
          />
        </div>
      </header>

      <main>
        <section>
          <div
            id="carouselIntroIndicators"
            class="carousel carousel-dark slide"
            data-bs-ride="carousel"
            data-bs-interval="false"
          >
            <div class="carousel-inner">
              <div class="carousel-item active">
                <img
                  src="./images/healthy-habit.svg"
                  class="d-block w-100"
                  style="max-height: 350px"
                  alt="Exercícios Físicos"
                />
                <div class="carousel-caption d-block">
                  <h5>Registre seus exercícios</h5>
                  <p>
                    Você pode registrar várias modalidades de atividade física,
                    além de possuir um histórico para acompanhamento de
                    evolução.
                  </p>
                </div>
              </div>
              <div class="carousel-item">
                <img
                  src="./images/eating-healthy-food.svg"
                  class="d-block w-100"
                  style="max-height: 350px"
                  alt="Conte calorias"
                />
                <div class="carousel-caption d-block">
                  <h5>Conte calorias</h5>
                  <p>
                    Importante para manter o controle de tudo que você ingere e,
                    dessa forma, saber exatamente o que te prejudica na perda de
                    peso.
                  </p>
                </div>
              </div>
              <div class="carousel-item">
                <img
                  src="./images/mental-health.svg"
                  class="d-block w-100"
                  style="max-height: 350px"
                  alt="Pressão Arterial"
                />
                <div class="carousel-caption d-block">
                  <h5>Acompanhe sua pressão arterial</h5>
                  <p>
                    Registre diariamente e acompanhe se está tudo em ordem. A
                    pressão arterial é um bom indicativo de qualidade de vida.
                  </p>
                </div>
              </div>
              <div class="carousel-item">
                <img
                  src="./images/diet.svg"
                  class="d-block w-100"
                  style="max-height: 350px"
                  alt="Registre seu peso"
                />
                <div class="carousel-caption d-block">
                  <h5>Registre seu peso</h5>
                  <p>
                    Acompanhe diariamente seu peso, mas atente-se para variações
                    dentro de um único dia. Fique tranquilo, temos gráficos para
                    você analisar a evolução.
                  </p>
                </div>
              </div>
            </div>
            <div class="carousel-indicators">
              <button
                type="button"
                data-bs-target="#carouselIntroIndicators"
                data-bs-slide-to="0"
                class="active"
                aria-current="true"
                aria-label="Slide 1"
              ></button>
              <button
                type="button"
                data-bs-target="#carouselIntroIndicators"
                data-bs-slide-to="1"
                aria-label="Slide 2"
              ></button>
              <button
                type="button"
                data-bs-target="#carouselIntroIndicators"
                data-bs-slide-to="2"
                aria-label="Slide 3"
              ></button>
              <button
                type="button"
                data-bs-target="#carouselIntroIndicators"
                data-bs-slide-to="3"
                aria-label="Slide 4"
              ></button>
            </div>
          </div>
        </section>
      </main>

      <footer>
        <div class="toolbar">
          <div class="d-grid w-100">
            <button
              type="button"
              class="btn btn-secondary btn-lg"
              data-bs-toggle="modal"
              data-bs-target="#loginModal"
            >
              Login
            </button>
          </div>
        </div>
      </footer>
    </div>
  </body>
  <script src="https://code.jquery.com/jquery-1.12.4.min.js" integrity="sha256-ZosEbRLbNQzLpnKIkEdrPv7lOy9C27hHQ+Xp8a4MxAQ=" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</html>
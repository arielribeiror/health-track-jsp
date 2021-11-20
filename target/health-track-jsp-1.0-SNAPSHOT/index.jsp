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
    <%@include file="snippets/modal-login.jsp"%>

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
          <%@include file="snippets/carousel-onboard.jsp"%>
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
    <script src="js/bootstrap.bundle.min.js"></script>
  </body>
</html>
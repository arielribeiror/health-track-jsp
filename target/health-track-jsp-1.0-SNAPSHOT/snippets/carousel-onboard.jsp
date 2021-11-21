<%@ page language="java" contentType="text/html; charset=UTF-8" %>
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

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div
    class="tab-pane fade show active"
    id="home"
    role="tabpanel"
    aria-labelledby="home-tab"
>

  <jsp:include page="../snippets/alert-message.jsp"></jsp:include>

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

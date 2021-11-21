<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8"/>
  <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <title>Health Track - Dashboard</title>

  <link rel="stylesheet" href="../css/main.css"/>
  <link rel="stylesheet" href="../css/style.css"/>
</head>
<body>

<jsp:include page="../snippets/modal-new-register.jsp"></jsp:include>

<jsp:include page="../snippets/toast-message.jsp"></jsp:include>

<div class="container d-grid">

  <jsp:include page="../snippets/header.jsp"></jsp:include>

  <main>
    <section class="h-100">
      <div class="tab-content h-100" id="tabnavContent">

        <jsp:include page="dashboard.jsp"></jsp:include>

        <jsp:include page="../tracking/tracking.jsp"></jsp:include>

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
              class="d-flex flex-column align-items-center justify-content-center h-100"
          >
            <div class="w-100 h-100 d-flex align-items-center justify-content-center">
              <span class="text-gray">Novidades em breve.</span>
            </div>

            <div class="list-group list-group-flush w-100">
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

  <jsp:include page="../snippets/menu.jsp"></jsp:include>
</div>
<script>
    const toastTrigger = document.getElementById('sucessToastBtn')
    const toastLiveExample = document.getElementById('sucessToast')
    if (toastTrigger) {
        toastTrigger.addEventListener('click', function () {
            const toast = new bootstrap.Toast(toastLiveExample)

            toast.show()
        })
    }
</script>
<script src="../js/bootstrap.bundle.min.js"></script>
</body>
</html>
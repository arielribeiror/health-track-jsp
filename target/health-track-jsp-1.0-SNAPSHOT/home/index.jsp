<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8"/>
  <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <title>Health Track - Dashboard</title>

  <link rel="stylesheet" href="../assets/css/main.css"/>
  <link rel="stylesheet" href="../assets/css/style.css"/>
</head>
<body>

<jsp:include page="../snippets/modal-new-track.jsp"></jsp:include>

<jsp:include page="../snippets/toast-message.jsp"></jsp:include>

<div class="container d-grid">

  <jsp:include page="../snippets/header.jsp"></jsp:include>

  <main>
    <section class="h-100">
      <div class="tab-content h-100" id="tabnavContent">

        <jsp:include page="dashboard.jsp"></jsp:include>

        <jsp:include page="../tracking/tracking.jsp"></jsp:include>

        <jsp:include page="../report/report.jsp"></jsp:include>

        <jsp:include page="../profile/profile.jsp"></jsp:include>
      </div>
    </section>
  </main>

  <jsp:include page="../snippets/menu.jsp"></jsp:include>
</div>
<script src="../js/main.js"></script>
<script src="../js/bootstrap.bundle.min.js"></script>
</body>
</html>
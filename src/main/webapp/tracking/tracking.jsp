<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div
    class="tab-pane fade"
    id="tracking"
    role="tabpanel"
    aria-labelledby="lists-tab"
>

  <jsp:include page="tab-tracking.jsp"></jsp:include>

  <div class="tab-content" id="tabListsContent">

    <jsp:include page="tab-weight.jsp"></jsp:include>

    <jsp:include page="tab-food.jsp"></jsp:include>

    <jsp:include page="tab-pressure.jsp"></jsp:include>

    <jsp:include page="tab-exercise.jsp"></jsp:include>
  </div>
</div>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="d-flex align-items-center text-primary mb-4">
  <i class="icon icon-heart-beats icon-36 me-4"></i>
  <span class="fs-3 fw-bold">Pressão Arterial</span>
</div>
<form>
  <div class="mb-3">
    <label for="systolic" class="form-label">
      Pressão Sistólica
    </label>
    <input
        type="number"
        id="systolic"
        name="systolic"
        class="form-control form-control-lg"
        placeholder="Digite a pressão sistólica"
    />
  </div>
  <div class="mb-3">
    <label for="diastolic" class="form-label">
      Pressão Diastólica
    </label>
    <input
        type="number"
        id="diastolic"
        name="diastolic"
        class="form-control form-control-lg"
        placeholder="Digite a pressão diastólica"
    />
  </div>
  <div class="mb-3">
    <label for="pressureDate" class="form-label">
      Data
    </label>
    <input
        type="date"
        id="pressureDate"
        name="pressureDate"
        class="form-control form-control-lg"
        placeholder="Selecione a data"
    />
  </div>
</form>
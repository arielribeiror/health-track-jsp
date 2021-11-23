<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="weightFormTrack">
  <div class="d-flex align-items-center text-primary mb-4">
    <i class="icon icon-body-weight icon-36 me-4"></i>
    <span class="fs-3 fw-bold">Peso</span>
  </div>
  <form>
    <div class="mb-3">
      <label for="weight" class="form-label">
        Digite o peso em Kg
      </label>
      <input
          type="number"
          step="0.1"
          id="weight"
          name="weight"
          class="form-control form-control-lg"
          placeholder="Digite seu peso atual"
      />
    </div>
    <div class="mb-3">
      <label for="weightDate" class="form-label">
        Data
      </label>
      <input
          type="date"
          id="weightDate"
          name="weightDate"
          class="form-control form-control-lg"
          placeholder="Selecione a data"
      />
    </div>
  </form>
</div>
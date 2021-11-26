<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="foodFormTrack">
  <div class="d-flex align-items-center text-primary mb-4">
    <i class="icon icon-chicken-leg icon-36 me-4"></i>
    <span class="fs-3 fw-bold">Alimentação</span>
  </div>
  <form id="foodForm" class="needs-validation" novalidate>
    <div class="mb-3">
      <label for="caloricGain" class="form-label">
        Calorias
      </label>
      <input
          type="number"
          id="caloricGain"
          name="caloricGain"
          class="form-control form-control-lg"
          placeholder="Digite as calorias da refeição"
          required
      />
      <div class="invalid-feedback">
        Digite as calorias  da refeição
      </div>
    </div>
    <div class="mb-3">
      <label for="foodType" class="form-label">
        Tipo da refeição
      </label>
      <select
          id="foodType"
          name="foodType"
          class="form-select form-select-lg"
          required
      >
        <option selected>Selecione o tipo da refeição</option>
      </select>
      <div class="invalid-feedback">
        Selecione o tipo da refeição
      </div>
    </div>
    <div class="mb-3">
      <label for="foodDescription" class="form-label">
        Descrição da refeição
      </label>
      <textarea
          id="foodDescription"
          name="foodDescription"
          class="form-control"
          placeholder="Descreva sua refeição como quiser">
    </textarea>
    </div>
    <div class="mb-3">
      <label for="foodDate" class="form-label">
        Data
      </label>
      <input
          type="date"
          id="foodDate"
          name="foodDate"
          class="form-control form-control-lg"
          placeholder="Selecione a data"
          required
      />
      <div class="invalid-feedback">
        Selecione a data
      </div>
    </div>
  </form>
</div>

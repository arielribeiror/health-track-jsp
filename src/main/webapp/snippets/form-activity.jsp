<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="activityFormTrack">
  <div class="d-flex align-items-center text-primary mb-4">
    <i class="icon icon-flash icon-36 me-4"></i>
    <span class="fs-3 fw-bold">Exercício Físico</span>
  </div>
  <form id="activityForm" class="needs-validation" novalidate>
    <div class="mb-3">
      <label for="caloricLoss" class="form-label">
        Gasto calórico
      </label>
      <input
          type="number"
          id="caloricLoss"
          name="caloricLoss"
          class="form-control form-control-lg"
          placeholder="Digite as calorias gastas"
          required
      />
      <div class="invalid-feedback">
        Digite as calorias gastas
      </div>
    </div>
    <div class="mb-3">
      <label for="activityType" class="form-label">
        Tipo da atividade
      </label>
      <select
          id="activityType"
          name="activityType"
          class="form-select form-select-lg"
          required
      >
        <option selected>Selecione o tipo de atividade</option>
      </select>
      <div class="invalid-feedback">
        Selecione o tipo de atividade
      </div>
    </div>
    <div class="mb-3">
      <label for="activityDescription" class="form-label">
        Descrição da atividade
      </label>
      <textarea
          id="activityDescription"
          name="activityDescription"
          class="form-control"
          placeholder="Descreva sua atividade física como quiser">
    </textarea>
    </div>
    <div class="mb-3">
      <label for="activityDate" class="form-label">
        Data
      </label>
      <input
          type="date"
          id="activityDate"
          name="activityDate"
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
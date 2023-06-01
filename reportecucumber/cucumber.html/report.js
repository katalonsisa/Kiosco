$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/GA/Gestion de la atencion/Kiosco.feature");
formatter.feature({
  "name": "Como funcionario quiero realizar la asignacion de los turnos",
  "description": "",
  "keyword": "Característica",
  "tags": [
    {
      "name": "@Kiosco"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Antecedentes"
});
formatter.step({
  "name": "que ingreso al portal de GA",
  "keyword": "Dado "
});
formatter.match({
  "location": "Kiosco.que_ingreso_al_portal_de_GA()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciono la opcion Kiosco del modulo Gestión de la atención",
  "keyword": "Y "
});
formatter.match({
  "location": "Kiosco.selecciono_la_opcion(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Asignar un turno para paz y salvo a un ciudadano",
  "description": "",
  "keyword": "Escenario",
  "tags": [
    {
      "name": "@Kiosco"
    }
  ]
});
formatter.step({
  "name": "que solicito un turno y ingreso un documento en el kiosco",
  "keyword": "Dado "
});
formatter.match({
  "location": "Kiosco.que_solicito_un_turno_y_ingreso_un_documento_en_el_kiosco()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el sistema me pida el tipo de servicio seleccion Solicitar paz y salvo",
  "keyword": "Cuando "
});
formatter.match({
  "location": "Kiosco.el_sistema_me_pida_el_tipo_de_servicio_selecion_solicitar(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "solicito el turno",
  "keyword": "Entonces "
});
formatter.match({
  "location": "Kiosco.solicito_el_turno()"
});
formatter.result({
  "status": "passed"
});
});
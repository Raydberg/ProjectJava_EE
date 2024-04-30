$(function() {
    var validator = $("form[name='frm-trabajador']").validate({
        rules: {
            nombre: "required",
            marca: "required",
            modelo: "required",
            proveedor: "required",
            color: "required",
            unidades: {
                required: true,
                minlength: 3
            }
        },
        messages: {
            nombre: {
                required: "Por favor, introduce un nombre."
            },
            marca: {
                required: "Por favor, introduce una marca."
            },
            modelo: {
                required: "Por favor, introduce un modelo."
            },
            proveedor: {
                required: "Por favor, introduce un proveedor."
            },
            color: {
                required: "Por favor, introduce un color."
            },
            unidades: {
                required: "Por favor, introduce la cantidad de unidades.",
                minlength: "Debe tener al menos 3 caracteres."
            }
        },
        errorElement: "div",
        errorPlacement: function(error, element) {
            error.addClass("invalid-feedback");
            error.insertAfter(element);
        },
        highlight: function(element, errorClass, validClass) {
            $(element).addClass("is-invalid").removeClass("is-valid");
        },
        unhighlight: function(element, errorClass, validClass) {
            $(element).addClass("is-valid").removeClass("is-invalid");
        }
    });

    $("button[type='submit']").click(function() {
        validator.form();
    });
});
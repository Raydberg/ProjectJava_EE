$(function() {
    var validator = $("form[name='frm-admin']").validate({
        rules: {
            nombre: "required",
            apellido: "required",
            puesto: "required",
            fechaNac: "required",
            genero: "required",
            direccion: "required",
            telefono: {
                required: true,
                minlength: 3
            },
            email: {
                required: true,
                email: true
            },
            salario: {
                required: true,
                number: true
            },
            contrasenia: "required"
        },
        messages: {
            nombre: {
                required: "Por favor, introduce un nombre."
            },
            apellido: {
                required: "Por favor, introduce un apellido."
            },
            puesto: {
                required: "Por favor, introduce un puesto."
            },
            fechaNac: {
                required: "Por favor, introduce una fecha de nacimiento."
            },
            genero: {
                required: "Por favor, introduce un genero."
            },
            direccion: {
                required: "Por favor, introduce una direccion."
            },
            telefono: {
                required: "Por favor, introduce un telefono.",
                minlength: "Debe tener al menos 3 caracteres."
            },
            email: {
                required: "Por favor, introduce un email.",
                email: "Por favor, introduce un email valido."
            },
            salario: {
                required: "Por favor, introduce un salario.",
                number: "Por favor, introduce un número válido."
            },
            contrasenia: {
                required: "Por favor, introduce una contraseña."
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
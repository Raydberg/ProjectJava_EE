$(document).ready(function() {
    var validator = $("form[name='frm-login']").validate({
        rules: {
            nombre: "required",
            contrasenia: {
                required: true,
                minlength: 5
            }
        },
        messages: {
            nombre: {
                required: "Por favor, introduce un nombre."
            },
            contrasenia: {
                required: "Por favor, introduce una contraseña.",
                minlength: "Tu contraseña debe tener al menos 5 caracteres."
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

$(document).ready(function() {
    $('.icon-tabler-eye-closed').on('click', function() {
        var passwordField = $('#password');
        var passwordFieldType = passwordField.attr('type');
        
        if (passwordFieldType == 'password') {
            passwordField.attr('type', 'text');
            $(this).attr('class', 'icon icon-tabler icons-tabler-outline icon-tabler-eye');
            $(this).html('<path stroke="none" d="M0 0h24v24H0z" fill="none"/><path d="M10 12a2 2 0 1 0 4 0a2 2 0 0 0 -4 0" /><path d="M21 12c-2.4 4 -5.4 6 -9 6c-3.6 0 -6.6 -2 -9 -6c2.4 -4 5.4 -6 9 -6c3.6 0 6.6 2 9 6" />');
        } else {
            passwordField.attr('type', 'password');
            $(this).attr('class', 'icon icon-tabler icons-tabler-outline icon-tabler-eye-closed');
            $(this).html('<path stroke="none" d="M0 0h24v24H0z" fill="none"/><path d="M21 9c-2.4 2.667 -5.4 4 -9 4c-3.6 0 -6.6 -1.333 -9 -4" /><path d="M3 15l2.5 -3.8" /><path d="M21 14.976l-2.492 -3.776" /><path d="M9 17l.5 -4" /><path d="M15 17l-.5 -4" />');
        }
    });
});

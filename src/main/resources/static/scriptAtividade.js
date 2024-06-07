(function(){
    $("#tabatividades").on("click",".js-delete",function(){
        //alert("clicou")
        let botaoclicado = $(this)
        $("#btnsim").attr("data-id",botaoclicado.attr("data-id"))
        $("#modelatividade").modal("show")
    })
    $("#btnsim").on("click", function(){
        let botaosim = $(this)
        let id = botaosim.attr("data-id")
        $.ajax({
            url: "/atividades/delete/" + id,
            method: "GET",
            success: function(){
                window.location.href = "/atividades"
            }
        })
    })
})()
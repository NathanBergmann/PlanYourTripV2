(function(){
    $("#tabrefeicoes").on("click",".js-delete",function(){
        //alert("clicou")
        let botaoclicado = $(this)
        $("#btnsim").attr("data-id",botaoclicado.attr("data-id"))
        $("#modelrefeicao").modal("show")
    })
    $("#btnsim").on("click", function(){
        let botaosim = $(this)
        let id = botaosim.attr("data-id")
        $.ajax({
            url: "/refeicoes/delete/" + id,
            method: "GET",
            success: function(){
                window.location.href = "/refeicoes"
            }
        })
    })
})()
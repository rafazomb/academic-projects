function validacaoEmail(field) {
    usuario = field.value.substring(0, field.value.indexOf("@"));
    dominio = field.value.substring(field.value.indexOf("@")+ 1, field.value.length);
    if ((usuario.length >=1) &&
        (dominio.length >=3) &&
        (usuario.search("@")==-1) &&
        (dominio.search("@")==-1) &&
        (usuario.search(" ")==-1) &&
        (dominio.search(" ")==-1) &&
        (dominio.search(".")!=-1) &&
        (dominio.indexOf(".") >=1)&&
        (dominio.lastIndexOf(".") < dominio.length - 1)) {
    document.getElementById("msgemail").innerHTML="E-mail válido";
   }
    else{
    document.getElementById("msgemail").innerHTML="Email inválido";
    document.getElementById('email').focus();
  }
    }
     function validaFormulario(){
    
      if (document.form.email.value == ""){
       alert ("Preencha o e-mail"); 
       document.getElementById('email').focus();
       return false;
      }
      if (document.form.email.value.length >30){
        alert ("Tamanho inválido"); 
        document.getElementById('email').focus();
        return false;
       }


      
    
      if (document.form.senha1.value == ""){
       alert ("Preencha a senha"); 
       document.getElementById('senha1').focus();
       return false;
      }
      if (document.form.senha2.value == ""){
       alert ("Preencha a confirmação da senha"); 
       document.getElementById('senha2').focus();
      }
      if (document.form.senha1.value != document.form.senha2.value ){
        alert ("As senhas precisam ser iguais"); 
       document.getElementById('senha1').focus(); 
    }
    
    let checkbox = document. getElementById('termo');
    if(checkbox.checked) {
      document.getElementById("form").submit();
   
    } else {
    alert("Leia o Termo de tratamento de dados e click no Aceite");
    
    }
} 
    document.getElementById("form").submit();
  
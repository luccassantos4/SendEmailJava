# SendEmailJava

<ul>
<li>Utilização da <b>API SendGrid</b> para envio dos E-mails (Plano gratuito)</li>
<li>Java</li>
<li>Postman</li>
</ul>

Corpo do Email EndPoint

```json
{
    "fromEmail" : "nome@dominio.com",
    "fromName" : "Nome",
    "replyTo" : "nome@dominio.com",
    "to" : "destinatario@gmail.com",
    "subject" : "Meu assunto",
    "body" : "Meu conteúdo do email com <strong>palavra forte</strong> destacada.",
    "contentType" : "text/html"
}
```

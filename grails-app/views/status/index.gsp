<%--
  Created by IntelliJ IDEA.
  User: kellyt1
  Date: 7/24/2015
  Time: 10:49 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>What are you doing?</title>
    <g:javascript library="prototype"/>
</head>

<body>
<h1>What are you doing?</h1>
<div class="updateStatusForm">
    <g:formRemote onSuccess="document.updateStatusForm.message.value=''" url="[action: 'updateStatus']" update="messages" name="updateStatusForm">
        <g:textArea name="message" value=""/><br/>
        <g:submitButton name="Update Status" value="" />
    </g:formRemote>
    </div>
    <div id="messages">
        <g:render template="messages" collection="${messages}" var="message"/>
    </div>
</body>
</html>
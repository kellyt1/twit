<%--
  Created by IntelliJ IDEA.
  User: kellyt1
  Date: 7/24/2015
  Time: 1:14 PM
--%>

<div class="statusMessage">
    <strong>${message.author.realName} said</strong>
    ${message.message}<br/>
    <div class="statusMessageTime">at <g:formatDate date="${message.dateCreated}"/></div>
</div>
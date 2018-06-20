<#import "/spring.ftl" as spring />
<nav class="navbar navbar-default" role="navigation">
  <ul class="nav nav-pills">
    <li class="nav-item">
      <a class="nav-link" href="<@spring.url dashboardPath/>">Home</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="<@spring.url dashboardPath/>/lastn">Last 1000 since startup</a>
    </li>
  </ul>
</nav>



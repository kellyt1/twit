import org.grails.twitter.auth.Authority
import org.grails.twitter.auth.Person
import org.grails.twitter.auth.PersonAuthority

class BootStrap {

    def init = { servletContext ->
        if(!Person.count()) {
            def userRole = new Authority(authority: 'ROLE_USER').save()

//            def password = springSecurityService.encodePassword('password').save

            [jeff: 'Jeff Brown', graeme: 'Graeme Rocher', burt: 'Burt']
            def user = new Person(username: userName, realName: realName)
            PersonAuthority.create user, userRole, true
        }
    }
    def destroy = {
    }
}

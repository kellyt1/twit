package org.grails.twitter

import org.grails.twitter.auth.Person

class StatusController {

    def springSecurityService

    def index() {
    def msgs = currentUserTimeLine()
        return [messages: msgs]
    }

    def updateStatus = {
        def status = new Status(message: params.message)
        status.author = lookupPerson()
        status.save()
        def message = currentUserTimeLine()
        render template: 'message', collection: messages, var: 'message'
    }

    private currentUserTimeLine(){
        def per = lookupPerson()
        def messages = Status.withCriteria {
                    author{
                        eq 'username', per.username
                }
                maxResults 10
                order 'dateCreated', 'desc'
            }
        messages
    }

    private lookupPerson(){
        Person.get(springSecurityService.principal.id)
    }
}

package createaliastest

import org.apache.commons.lang.builder.HashCodeBuilder

class UserRequest implements Serializable{
    User user
    Request request

    static mapping = {
        id composite: ['user', 'request']
        version false
    }

    //equals & hashcode

    boolean equals (other) {
        if (!(other instanceof UserRequest))
            return false

        other.user?.id == user?.id && other.request?.id == request?.id
    }

    int hashCode() {
        def builder = new HashCodeBuilder()
        if (user) builder.append(user.id)
        if (request) builder.append(request.id)
        builder.toHashCode()
    }

    static UserRequest create (User user, Request request, boolean flush = true) {
        def d = new UserRequest (user: user, request: request).save(flush: flush, insert: true)
    }
    static constraints = {
    }

}

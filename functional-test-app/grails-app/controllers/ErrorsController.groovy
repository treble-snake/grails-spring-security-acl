import grails.plugin.springsecurity.annotation.Secured

@Secured(['permitAll'])
class ErrorsController {

	def error403() {}

	def error404() {
		println "\n\nERROR 404: could not find $request.forwardURI\n\n"
	}

	def error500() {
		render view: '/error'
	}
}

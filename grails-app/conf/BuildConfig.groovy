grails.project.work.dir = 'target'
grails.project.class.dir = 'target/classes'
grails.project.test.class.dir = 'target/test-classes'
grails.project.test.reports.dir = 'target/test-reports'

grails.project.repos.eevolPublic.url = "http://maven.eevol.lu/nexus/content/repositories/eevol-grails-public/"
grails.project.repos.snapshots.url = "http://maven.eevol.lu/nexus/content/repositories/snapshots/"
grails.project.repos.default = "snapshots"

grails.project.dependency.resolution = {

	inherits 'global'
	log 'warn'

	repositories {
		grailsCentral()
		mavenLocal()
		mavenCentral()
		mavenRepo 'http://repo.grails.org/grails/libs-releases'
		mavenRepo 'https://oss.sonatype.org/content/groups/public'
	}

	dependencies {
		compile 'joda-time:joda-time:2.3'

		test('org.hamcrest:hamcrest-all:1.1') { export = false }
		test('org.jodd:jodd-lagarto:3.4.1') { export = false }
	}

	plugins {
		build ':release:3.1.1', ':rest-client-builder:1.0.3', {
			export = false
		}
	}
}

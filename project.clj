(defproject cloj-webapp "0.1.0"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :main cloj-webapp.handler
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.6"]
                 [hiccup "1.0.2"]
                 [org.clojure/java.jdbc "0.2.3"]
                 [com.h2database/h2 "1.3.170"]
                 [ring/ring-jetty-adapter "1.2.1"]] ; see clojars for current version
  :plugins [[lein-ring "0.8.8"]]
  :ring {:handler cloj-webapp.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})

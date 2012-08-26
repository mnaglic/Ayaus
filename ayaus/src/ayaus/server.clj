(ns ayaus.server
  (:require [noir.server :as server]
            [monger.core :as mgcore]))

(server/load-views-ns 'ayaus.views)

(mgcore/connect!)

(mgcore/set-db! (mgcore/get-db "ayaus-db"))

(defn -main [& m]
  (let [mode (keyword (or (first m) :dev))
        port (Integer. (get (System/getenv) "PORT" "8080"))]
    (server/start port {:mode mode
                        :ns 'ayaus})))


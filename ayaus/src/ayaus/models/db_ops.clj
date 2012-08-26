(ns ayaus.models.db-ops
  "Contains operations for working with the db, i.e. storing and fetching URLs"
  (:require [monger.collection :as mc])
  (:import (java.lang Long)))

(defn get-short-url 
  "Stores the URL in the db and returns a shortened URL."
  [long-url]
  (let [index (mc/count "urls")
        url-to-store (if (or (.startsWith long-url "http://") (.startsWith long-url "https://"))
                       long-url
                       (str "http://" long-url))]
    (mc/insert "urls" {:_id index :url url-to-store})
    (Long/toString index 36)))

(defn fetch-url
  "Fetches a URL by it's key (shortened URL) or nil if no URL with the given key exists."
  [short-url]
  (if-let [url-map (mc/find-one-as-map "urls" {:_id (Long/parseLong short-url 36)})]
    (url-map :url)
    nil))
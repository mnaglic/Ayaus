(ns ayaus.script
  (:require [fetch.remotes :as remotes])
  (:require-macros [fetch.macros :as fm])
  (:use [domina :only [value by-id set-text!]]
        [domina.events :only [listen!]]))

(defn get-short-url [long-url]
  (fm/remote (get-url long-url) [short-url]
  (set-text! (by-id "response") (str (.-location js/window) short-url))))

(listen! (by-id "shorten-button") :click (fn [evt] (get-short-url (value (by-id "url-text")))))
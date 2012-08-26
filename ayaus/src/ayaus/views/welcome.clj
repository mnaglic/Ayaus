(ns ayaus.views.welcome
  (:require [ayaus.views.common :as common]
            [ayaus.models.db-ops :as ayaus])
  (:use [noir.core :only [defpage]]
        [noir.response :only [redirect]]
        [noir.fetch.remotes]))

(defpage "/" []
         (common/layout
           [:div.row
            [:div.span10 {:style "text-align:center"}
             [:h1.page-header "Enter the URL you want to shorten:"]
             [:div.input-append.span10
             [:input#url-text {:type "text"}]             
             [:input#shorten-button.btn {:type "submit" :value "Shorten!"}]]
             [:p#response]]]))

(defpage "/:short-url" {:keys [short-url]}
  (redirect (ayaus/fetch-url short-url)))

(defremote get-url [long-url]
  (ayaus/get-short-url long-url))
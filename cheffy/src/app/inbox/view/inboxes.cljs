(ns app.inbox.view.inboxes
  (:require [app.components.page-nav :refer [page-nav]]))


(defn inboxes
  []
  [page-nav {:center "Inbox"}])

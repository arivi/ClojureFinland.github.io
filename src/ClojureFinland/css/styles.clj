(ns ClojureFinland.css.styles
  (:require [garden.core :as garden]))

(defn gen-styles [_]
  (garden/css
   [:body
    {:color            "#55AD1B"
     :font-family      ["Courier" "monospace"]
     :background-color "#0F0D01"
     :font-size        "14px"}]

   [:a
    {:color "#1D96AD"}]

   [:a:hover
    {:color "#21a5bf"}]

   [:h1 :h2
    {:color "#99A3A4"}]

   [:table :td
    {:vertical-align "top"}]

   [:.code
    {:color "#80898a"}]

   [:.separator
    {:height "0.5em"}]

   [:.container
    {:display               "inline-grid"
     :grid-template-columns "0.75em min-content 0.5em"}]

   [:.item-first
    {:padding-top "0.2em"}]

   [:.item-last
    {:padding-bottom "0.25em"
     :align-self     "end"}]))

(ns kotoba.capability.gpu.draw-frame
  "Importable contract for gpu/draw-frame.")

(def manifest
  {:schema "kotoba.capability.repository.v1", :capability/version 1, :capability/dependencies #{}, :capability/imports #{:gpu-draw-frame}, :authority "kotoba-lang/kotoba-core-contracts", :capability/default-policy :autonomous, :capability/artifact {:format :wasm-component, :digest-required? true, :signature-required? true}, :capability/radicle-rid nil, :capability/repository "kotoba-lang/capability-gpu-draw-frame", :capability/id "gpu/draw-frame", :capability/effects #{:device-write}, :capability/provider-status :contract-only})

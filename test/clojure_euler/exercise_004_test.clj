(ns clojure-euler.exercise-004-test
  (:require [clojure.test :refer :all]
            [clojure-euler.exercise-004 :refer :all]))


(deftest euler-004-test
  (let [expected-result 906609]
    (testing "Testing euler-004"
      (is (= expected-result (euler-004))))))


;; Run all tests
(run-tests)
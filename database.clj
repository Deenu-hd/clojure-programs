;----------Database connection---------
(def connection_name {
   :subprotocol “protocol_name”
   :subname “Location of mysql DB”
   :user “username” :password “password” })

;--------SELECT----------
(defn -main []
   (def mysql-db {
      :subprotocol "mysql"
      :subname "//127.0.0.1:3306/information_schema"
      :user "root"
      :password "shakinstev"})
   (println (sql/query mysql-db
      ["select table_name from tables"]
      :row-fn :table_name)))

;--------INSERT---------
(defn -main []
   (def mysql-db {
      :subprotocol "mysql"
      :subname "//127.0.0.1:3306/testdb"
      :user "root"
      :password "shakinstev"})
   (sql/insert! mysql-db
      :employee {:first_name "John" :last_name "Mark" :sex "M" :age 30 :income 30}))

;--------DELETE--------------
(defn -main []
   (def mysql-db {
      :subprotocol "mysql"
      :subname "//127.0.0.1:3306/testdb"
      :user "root"
      :password "shakinstev"})
   (println (sql/delete! mysql-db
      :employee ["age = ? " 30])))

;--------UPDATE---------------

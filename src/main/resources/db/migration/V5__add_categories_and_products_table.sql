 -- Create the categories table
  CREATE TABLE IF NOT EXISTS categories
  (
      id     TINYINT AUTO_INCREMENT PRIMARY KEY,
      name   VARCHAR(255) NOT NULL
  );

  -- Create the products table
  -- Prevent from deleting category if there is product in that cateogry
  CREATE TABLE IF NOT EXISTS products
  (
     id           BIGINT AUTO_INCREMENT PRIMARY KEY,
     name         VARCHAR(255) NOT NULL,
     price        DECIMAL(10,2) NOT NULL,
     category_id  TINYINT,
     CONSTRAINT category_id_fk
              FOREIGN KEY (category_id) REFERENCES categories(id)
              ON DELETE RESTRICT
  );
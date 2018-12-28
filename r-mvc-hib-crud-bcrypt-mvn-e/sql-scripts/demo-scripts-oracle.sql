CREATE TABLE customer (
  id number(11) NOT NULL,
  first_name varchar(45) DEFAULT NULL,
  last_name varchar(45) DEFAULT NULL,
  email varchar(45) DEFAULT NULL,
  PRIMARY KEY (id)
)

    delete  from customer;
    INSERT INTO customer VALUES (1,'David','Adams','david@demo.com');
	INSERT INTO customer VALUES (2,'John','Doe','john@demo.com');  
    INSERT INTO customer VALUES	(3,'Ajay','Rao','ajay@demo.com');
    INSERT INTO customer VALUES	(4,'Mary','Public','mary@demo.com');
    INSERT INTO customer VALUES	(5,'Maxwell','Dixon','max@demo.com'); 
    commit;
    select * from customer;
    
   
CREATE TABLE user (
  user_name varchar(45) DEFAULT NULL,
  password varchar(100) DEFAULT NULL,
  PRIMARY KEY (user_name)
);
    
    --BELOW CODE IS NOT REQUIRED
    drop sequence customer_id_seq;
 create sequence customer_id_seq;
 
 drop trigger trg_customer_id;
  create trigger trg_customer_id
      before insert on customer
      for each row
    begin
      select customer_id_seq.nextval
        into :new.id
        from dual;
    end;
    /
    
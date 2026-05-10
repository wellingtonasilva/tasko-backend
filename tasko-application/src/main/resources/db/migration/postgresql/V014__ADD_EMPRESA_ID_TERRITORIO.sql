ALTER TABLE crm.vendedor_territorio
    ADD COLUMN emp_id int8 NULL,
    ADD CONSTRAINT xfk1_vendedor_territorio FOREIGN KEY (emp_id) REFERENCES crm.empresa(emp_id);
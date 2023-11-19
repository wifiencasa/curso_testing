module secretaria {

    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    requires lombok;
    requires org.apache.logging.log4j;


    requires jakarta.inject;
    requires jakarta.cdi;
    requires io.vavr;

    exports ui.main to javafx.graphics;
    exports ui.pantallas.principal;

    exports common.config;
    exports ui.pantallas.common;
    exports ui.pantallas.listado;
    exports common;
    exports dao;
    exports domain.usecases;
    exports domain.modelo;

    opens ui.pantallas.listado to javafx.fxml;


    opens domain.modelo to javafx.base;

    opens ui.pantallas.principal;
    opens ui.main;
    opens fxml;





}

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


(function ($) {

    client = {
        hasFocus: false,
        sessiontoken: "",
        uiInit: function () {

            $("#radio-group input").unwrapUntil("#radio-group");

            //adding input classes
            $(".js-unwrap-start").unwrapUntil(".js-unwrap-end").addClass("input-radio");
            //put .js-unwrap-start on the selecOneradio enabledClass 
            //put js-unwrap-end on the class not to unwrap, so it will unwrap up to this class

            //dding label classes: use technique from office JS
        }
    };


    //needed
    $(document).ready(function () {
        client.uiInit();
    });
})(jQuery);






//UTILITIES
//unwrap table from JSF radio buttons or any other elemenst
(function ($) {
    /**
     * unwrap paarenst elemensts
     * especialy tables created by JSF radio buttons or any other elemenst
     * this function will unwrap upto the element stated by the selctor parameter below
     */
    $.fn.unwrapUntil = function (selector) {
        $.each(this, function () {
            var $this = $(this);
            if ($this.closest(selector).length > 0) {
                while ($this.parent(selector).length === 0) {
                    $this.unwrap();
                }
            }
        });
    };

})(jQuery);

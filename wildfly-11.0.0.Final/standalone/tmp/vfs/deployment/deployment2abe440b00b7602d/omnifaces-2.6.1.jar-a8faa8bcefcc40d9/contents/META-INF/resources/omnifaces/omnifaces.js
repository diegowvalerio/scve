var OmniFaces=OmniFaces||{};
OmniFaces.Util=function(d,k){function g(a,b,c,h,d){h=h.replace(/^\s+|\s+$/g,"").split(/\s+/);for(var f=0;f<h.length;f++){var e=h[f];if(a[b])a[b](e,d);else if(a[c])a[c]("on"+e,d)}}function e(a,b,c){var h=a[b];h&&(a[b]=function(){c();return h.apply(this,arguments)})}var f={addEventListener:function(a,b,c){g(a,"addEventListener","attachEvent",b,c)},removeEventListener:function(a,b,c){g(a,"removeEventListener","detachEvent",b,c)},addOnloadListener:function(a){if("complete"===k.readyState)setTimeout(a);
else if(d.addEventListener||d.attachEvent)f.addEventListener(d,"load",a);else if("function"===typeof d.onload){var b=d.onload;d.onload=function(){b();a()}}else d.onload=a},addSubmitListener:function(a){f.addEventListener(k,"submit",a);d.mojarra&&e(mojarra,"jsfcljs",a);d.myfaces&&e(myfaces.oam,"submitForm",a);d.PrimeFaces&&e(PrimeFaces,"addSubmitParam",a)},resolveFunction:function(a){return"function"!==typeof a&&(a=d[a]||function(){}),a}};return f}(window,document);
OmniFaces.Highlight=function(d,k){function g(){d.removeEventListener(this,"click input",g);var f=this.getAttribute("data-omnifaces-highlight-class");if(f){this.removeAttribute("data-omnifaces-highlight-class");f=new RegExp(" "+f,"g");this.className=this.className.replace(f,"");var a=this.getAttribute("data-omnifaces-highlight-label");a&&(this.removeAttribute("data-omnifaces-highlight-label"),a=e[this.id],a.className=a.className.replace(f,""))}}var e;return{apply:function(f,a,b){for(var c=k.getElementsByTagName("LABEL"),
h={},l=0;l<c.length;l++){var q=c[l],n=q.htmlFor;n&&(h[n]=q)}e=h;for(c=0;c<f.length;c++)if(l=f[c],h=k.getElementById(l),h||(l=k.getElementsByName(l))&&l.length&&(h=l[0]),h){h.className+=" "+a;h.setAttribute("data-omnifaces-highlight-class",a);if(l=e[h.id])l.className+=" "+a,h.setAttribute("data-omnifaces-highlight-label",!0);b&&(h.focus(),b=!1);d.addEventListener(h,"click input",g)}}}}(OmniFaces.Util,document);
OmniFaces.DeferredScript=function(d,k){function g(f){if(!(0>f||f>=e.length)){var a=e[f],b=k.createElement("script"),c=k.head||k.documentElement;b.async=!0;b.src=a.url;b.setAttribute("crossorigin","anonymous");b.onerror=function(){a.error()};b.onload=b.onreadystatechange=function(c,d){if(d||!b.readyState||/loaded|complete/.test(b.readyState)){b.onload=b.onreadystatechange=null;if(d)b.onerror();else a.success();b=null;g(f+1)}};a.begin();c.insertBefore(b,null)}}var e=[];return{add:function(f,a,b,c){e.push({url:f,
begin:d.resolveFunction(a),success:d.resolveFunction(b),error:d.resolveFunction(c)});1==e.length&&d.addOnloadListener(function(){g(0)})}}}(OmniFaces.Util,document);
OmniFaces.Unload=function(d,k,g,e){function f(){for(var a=0;a<e.forms.length;a++)if(e.forms[a]["javax.faces.ViewState"])return e.forms[a];return null}var a,b,c={init:function(h){if(g.XMLHttpRequest){if(null==a){var e=f();if(!e){jsf&&"Development"==jsf.getProjectStage()&&g.console&&console.error&&console.error("OmniFaces @ViewScoped: cannot find a JSF form in the document. Unload will not work. Either add a JSF form, or use @RequestScoped instead.");return}d.addEventListener(g,g.onbeforeunload?"unload":
"beforeunload",function(){if(b)c.reenable();else try{var d=e.action.split(/[?#;]/)[0],h="omnifaces.event\x3dunload\x26id\x3d"+a+"\x26javax.faces.ViewState\x3d"+encodeURIComponent(e["javax.faces.ViewState"].value);if(k.sendBeacon)k.sendBeacon(d+"?"+h);else{var f=new XMLHttpRequest;f.open("POST",d,!1);f.send(h)}}catch(g){}});d.addSubmitListener(function(){c.disable()})}a=h;b=!1}},disable:function(){b=!0},reenable:function(){b=!1}};return c}(OmniFaces.Util,navigator,window,document);
OmniFaces.Push=function(d,k){function g(a,b,d,f,e,k){var g,m,p=this;p.open=function(){g&&1==g.readyState||(g=new WebSocket(a),g.onopen=function(a){null==m&&d(b);m=0},g.onmessage=function(a){var c=JSON.parse(a.data);f(c,b,a);if((a=k[c])&&a.length)for(c=0;c<a.length;c++)a[c]()},g.onclose=function(a){!g||1E3==a.code&&"Expired"==a.reason||1008==a.code||null==m||25<=m?e(a.code,b,a):setTimeout(p.open,500*m++)})};p.close=function(){if(g){var a=g;g=null;null==m;a.close()}}}function e(c){var b=a[c];if(b)return b;
throw Error("Unknown channel: "+c);}var f=k.location.protocol.replace("http","ws")+"//",a={},b={init:function(c,e,l,q,n,r,s){n=d.resolveFunction(n);var m=e.split(/\?/)[0];if(k.WebSocket){if(!a[m]){var p=(c=c||"")&&0!=c.indexOf("/")?0==c.indexOf(":")?k.location.hostname:"":k.location.host;a[m]=new g(f+p+c+"/omnifaces.push/"+e,m,d.resolveFunction(l),d.resolveFunction(q),n,r)}s&&b.open(m)}else n(-1,m)},open:function(a){e(a).open()},close:function(a){e(a).close()}};return b}(OmniFaces.Util,window);
OmniFaces.InputFile=function(d,k){return{validate:function(g,e,f,a){if(!d.FileReader)return!0;k.getElementById(f).innerHTML="";for(f=0;f<e.files.length;f++){var b=e.files[f];if(b.size>a){a=b.name;var c;d.mojarra&&(c=e.form.enctype,e.form.enctype=null);e.value=null;jsf.ajax.request(e.id,g,{"omnifaces.event":"validationFailed",fileName:a});c&&(e.form.enctype=c);return!1}}return!0}}}(window,document);
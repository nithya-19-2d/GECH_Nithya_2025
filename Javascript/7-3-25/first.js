// console.log("Hello");
// console.log(document.getRootNode());

const document_root = document.getRootNode();
console.log(document_root.childNodes);

const html_tag = document_root.childNodes[1];
console.log(html_tag);
console.log(html_tag.childNodes);

const head_tag = html_tag.childNodes[0];
console.log(head_tag.childNodes);
console.log(head_tag.children);

const title_tag = head_tag.children[0];
console.log(title_tag);
console.log(title_tag.innerText);
console.log(title_tag.textContent);
console.log(title_tag.innerHTML);
console.log(title_tag.parentNode);
console.log(title_tag.nextSibling);
console.log(title_tag.nextElementSibling);

const body_tag = html_tag.childNodes[2];
console.log(body_tag);
console.log(body_tag.childNodes);
console.log(body_tag.children);

const div_tag = body_tag.children[0];
console.log(div_tag);
console.log(div_tag.innerHTML);
console.log(div_tag.childNodes);

const h1_tag = div_tag.childNodes[1];
console.log(h1_tag);
console.log(h1_tag.innerText);


const p_tag = div_tag.childNodes[3];
console.log(p_tag.childNodes);
console.log(p_tag);
console.log(p_tag.innerText);

const script_tag = body_tag.children[1]
console.log(script_tag);
console.log(script_tag.childNodes);
console.log(script_tag.innerHTML);
console.log(script_tag.innerText);








// script.js

// Mobile menu
const menuButton = document.getElementById('menuToggle');
const nav = document.getElementById('nav');

menuButton.addEventListener('click', () => {
  nav.classList.toggle('open');
});

// Close menu when clicking a link (mobile)
nav.querySelectorAll('.nav-link').forEach(link => {
  link.addEventListener('click', () => nav.classList.remove('open'));
});

// Smooth scroll
document.querySelectorAll('a[href^="#"]').forEach(anchor => {
  anchor.addEventListener('click', (e) => {
    const target = document.querySelector(anchor.getAttribute('href'));
    if (!target) return;
    e.preventDefault();
    target.scrollIntoView({ behavior: 'smooth', block: 'start' });
    history.replaceState(null, '', anchor.getAttribute('href'));
  });
});

// Active link on scroll
const sections = [...document.querySelectorAll('section[id]')];
const links = [...document.querySelectorAll('.nav-link')];

const setActive = () => {
  let current = sections[0].id;
  const fromTop = window.scrollY + 90;
  sections.forEach(sec => {
    if (sec.offsetTop <= fromTop) current = sec.id;
  });
  links.forEach(l => {
    l.classList.toggle('active', l.getAttribute('href') === `#${current}`);
  });
};
window.addEventListener('scroll', setActive);
setActive();

// Contact form validation (client-side demo)
const form = document.getElementById('contactForm');
form.addEventListener('submit', (e) => {
  e.preventDefault();

  const name = document.getElementById('name');
  const email = document.getElementById('email');
  const message = document.getElementById('message');

  const nameError = document.getElementById('nameError');
  const emailError = document.getElementById('emailError');
  const messageError = document.getElementById('messageError');

  let ok = true;

  if (!name.value.trim()) {
    nameError.textContent = 'Please enter a name.';
    ok = false;
  } else nameError.textContent = '';

  const emailValid = /^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email.value);
  if (!emailValid) {
    emailError.textContent = 'Enter a valid email address.';
    ok = false;
  } else emailError.textContent = '';

  if (message.value.trim().length < 10) {
    messageError.textContent = 'Message should be at least 10 characters.';
    ok = false;
  } else messageError.textContent = '';

  if (ok) {
    alert('Thanks! Form validated locally for this demo.');
    form.reset();
  }
});

// Footer year
document.getElementById('year').textContent = new Date().getFullYear();

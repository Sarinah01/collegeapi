document.addEventListener("DOMContentLoaded", () => {
    fetchColleges();
});

async function fetchColleges() {
    const response = await fetch('/api/colleges');
    const colleges = await response.json();
    displayColleges(colleges);
}

function displayColleges(colleges) {
    const tbody = document.querySelector("#collegeTable tbody");
    colleges.forEach(college => {
        college.courses.forEach(course => {
            const row = document.createElement("tr");
            row.innerHTML = `
                <td>${college.name}</td>
                <td>${course.name}</td>
                <td>${course.fee}</td>
                <td>${course.duration}</td>
                <td>${course.accommodationType}</td>
                <td>${course.accommodationFee}</td>
            `;
            tbody.appendChild(row);
        });
    });
}
